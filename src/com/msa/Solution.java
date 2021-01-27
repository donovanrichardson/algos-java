package com.msa;

class Solution {

    void shift(int curIdx, int endIdx, int[] nums1, int newItem){
        System.out.println(String.format("is %s, greater than or eq %s?", endIdx, curIdx));
        while(endIdx >= curIdx){
            System.out.println(String.format("indeed %s, was greater than or eq %s. how about now?", endIdx, curIdx));
            System.out.println(String.format(" %s will be shifted", nums1[endIdx]));

            nums1[endIdx+1] = nums1[endIdx];
            System.out.println(String.format(" %s was shifted", nums1[endIdx + 1]));
            endIdx --;
        }
        nums1[curIdx] = newItem;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        int b = m - 1;
        System.out.println("here ye hear ye");
        for(int n2 : nums2){
//            System.out.println(n2);
            if(b >= a){


            while(true){
                //                System.out.println(b);
//                System.out.println(a);
                System.out.println(String.format("%s, less than or eq %s?", b, a));
                if(n2 >= nums1[a]){
                    System.out.println("increment");
                    a++;
//                     break;
                }else{
                    System.out.println("does a shift");
                    this.shift(a,b,nums1,n2);
                    a++;
                    b++;
                    System.out.println("end of shift");
                    break;
                }
//                System.out.println(a);
//                System.out.println(b);
//                System.out.println(nums1[a]);
//                System.out.println(n2);
            }
            break;
            }
            System.out.println("later increment");
            nums1[a] = n2;
            a++;
        }
    }
}