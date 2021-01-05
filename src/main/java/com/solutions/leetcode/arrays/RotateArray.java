package com.solutions.leetcode.arrays;

import java.util.Arrays;

class RotateArray {
    //Rotate Array
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

    public void rotate(int[] nums, int k) {
        int rotation = k%nums.length;
        int[] rotated = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            rotated[i] = nums[i];
        }
        
        int index = 0;
        for(int i=rotation; i<nums.length; i++){
            nums[i] = rotated[index];
            index++;
        }
        
        for(int i=0; i<rotation; i++){
            nums[i] = rotated[index];
            index++;
        }
    }

    public static void main(String args[]){
        RotateArray rotateArray = new RotateArray();

        int[] numbers = new int[] {-1,-100,3,99};

        rotateArray.rotate(numbers,2);

        System.out.println(Arrays.toString(numbers));
    }
}