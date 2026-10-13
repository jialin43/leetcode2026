package org.example.leetcode;

import java.util.ArrayList;

public class L1352 {
    private static class ProductOfNumbers {
        int[] array = new int[40010];
        int index = 0;
        public ProductOfNumbers() {
        }

        public void add(int num) {
            if(index==0) {
                array[0] = num;
            }else {
                array[index] = array[index-1] *num;
            }
            if(num==0) {
               for (int i=0;i<index;i++) {
                   array[i] = 0;
               }
            }
            index++;

        }

        public int getProduct(int k) {
            Integer total = array[index-1];
            Integer pre = array[k];
            
            return total/pre;
        }
    }

    public static void main(String[] args) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
  int param_2 = obj.getProduct(2);
        System.out.println(param_2);
    }

}
