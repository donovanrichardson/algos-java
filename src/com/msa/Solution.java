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

    void appendRest(int[] nums1, int fromNums, int[] rest, int fromRest){
        int appIdx = fromNums;
        for(int i = fromRest; i < rest.length; i++){
            nums1[appIdx] = rest[i];
            appIdx ++;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        int b = m - 1;
        boolean endphase = false;
        System.out.println("here ye hear ye");
//        int curIdx = 0;
//        int curNum = nums2[curIdx];
        for(int i = 0; i<nums2.length;i++){
            int n2 = nums2[i];
            while(b >= a){
                if(nums1[a]>n2){
                    this.shift(a,b,nums1,n2);
                    a++;
                    b++;//may be +=2
                    break;
                }else{
                    a++;
                }
            }
            if(b < a){
                appendRest(nums1,a,nums2,i);
                break;
            }
        }
    }
}