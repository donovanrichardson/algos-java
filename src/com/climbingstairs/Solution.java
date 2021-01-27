package com.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        switch(n){
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return climbStairs(n -1) + climbStairs(n-2);
        }
    }
}