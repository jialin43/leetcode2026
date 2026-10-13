package org.example.od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 提取URL列表中出现次数不少于 2 次的不同 URL 路径前缀，并统计其出现次数。每行输出一个路径前缀和一个整数，用空格分隔，表示该前缀及其出现次数，按出现次数从多到少排序，次数相同时，按路径前缀字典序升序排列。
     * @param urls string字符串ArrayList 待处理的URL列表
     * @return string字符串ArrayList
     */
    public static ArrayList<String> processUrlExtract(ArrayList<String> urls) {
        // write code here
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        ArrayList<String> result = new ArrayList<>();
        for(String url:urls) {
            String[] address = url.split("/");
            if(address.length==0) {
                treeMap.put("/",treeMap.getOrDefault("/",0)+1);
            }
            String key = "";
            for (String str:address) {
                if(Objects.equals(str, "")) {
                    continue;
                }
                key = key + "/" + str;

                if(treeMap.containsKey(key)) {
                    treeMap.put(key,treeMap.get(key)+1);
                }else {
                    treeMap.put(key,1);
                }
            }
        }
        for(String key:treeMap.keySet()) {
            if(treeMap.get(key)==1) {
                continue;
            }else {
                String res = key + " " + treeMap.get(key);
                result .add(res);
            }
        }

        return result;
    }

    public static void main(String[] args) {


//        ArrayList<String> inputs = new ArrayList<>();
//        inputs.add("/");
//        inputs.add("/");
//
//
//        ArrayList<String> arrayList = processUrlExtract(inputs);
//
//        System.out.println(arrayList);
        int[][] sequences = findSequences(3, 3);
        System.out.println(sequences);
    }


    public static int[][] findSequences (int n, int k) {
        // write code here
       int[][] res = new int[n][n];
       int start = 0;
       for(int i=1;i<=n;i++) {
           int[] line = new int[k];
           int index = 0;
           for(int j=1;j<=k;j++) {
               line[index++] = i;
           }
           res[start++] = line;
       }
       return res;
    }
}