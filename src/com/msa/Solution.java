package com.msa;

class Solution {

    void shift(int curIdx, int endIdx, int[] nums1, int newItem){
        while(endIdx >= curIdx){
            nums1[endIdx+1] = nums1[endIdx];
        }
        nums1[curIdx] = newItem;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        int b = m - 1;
//        System.out.println("here ye hear ye");
        for(int n2 : nums2){
            System.out.println(n2);
            if(b >= a){
//                System.out.println(b);
//                System.out.println(a);
                if(n2 < nums1[a]){
                    System.out.println("not a blank string");
                     this.shift(a,b,nums1,n2);
                }
            }
            nums1[a] = n2;
            a++;
        }
    }
}