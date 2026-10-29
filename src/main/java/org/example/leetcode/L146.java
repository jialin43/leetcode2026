package org.example.leetcode;

import java.util.HashMap;

public class L146 {


    HashMap<Integer, Node> hash = new HashMap<>();
    Integer total;
    Node l, r;

    public L146(int capacity) {
        total = capacity;
        l = new Node(-1, -1);
        r = new Node(-1, -1);
        l.right = r;
        r.left = l;
    }

    public int get(int key) {
        if (!hash.containsKey(key)) {
            return -1;
        }
        Node t = hash.get(key);
        remove(t);
        insert(t);
        return hash.get(key).getVal();
    }

    public void put(int key, int value) {

        if(hash.containsKey(key)) {
            Node t = hash.get(key);
            t.setVal(value);
            hash.put(key,t);
            remove(t);
            insert(t);
        }else {
            Node t = new Node(key,value);
            if (hash.size() == total) {

                hash.remove(r.left.key);
                remove(r.left);
            }
            insert(t);
            hash.put(key,t);
        }




    }

    public void remove(Node p) {
        p.left.right = p.right;
        p.right.left = p.left;

    }

    public void insert(Node p) {
        p.right = l.right;
        p.left = l;
        l.right.left = p;
        l.right = p;


    }

    class Node {
        int key;
        int val;
        Node left;
        Node right;

        Node(int _key, int _val) {
            this.key = _key;
            this.val = _val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        L146 lru = new L146(2);
        lru.put(1,1);
        lru.put(2,2);
        int res = lru.get(1);
        System.out.println(res);
        lru.put(3,3);
        res = lru.get(2);

    }
}
