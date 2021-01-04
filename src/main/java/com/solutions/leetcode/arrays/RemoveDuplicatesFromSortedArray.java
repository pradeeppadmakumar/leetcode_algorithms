package com.solutions.leetcode.arrays;

import java.util.Arrays;

class RemoveDuplicatesFromSortedArray {
	
	// Remove Duplicates from Sorted Array
	// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
	
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        int uniqueValue = 1;
        
        for(int index = 0; index< nums.length-1; index++){
            if(nums[index]!= nums[index+1]){
                nums[uniqueValue] = nums[index+1];
                uniqueValue++;
            }
        }
        
        return uniqueValue;
    }
    
    public static void main(String args[]) {
    	RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    	
    	int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
    	
    	int removeDuplicates = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    	
    	int[] newNums = Arrays.copyOfRange(nums, 0, removeDuplicates);
    	
    	System.out.println(Arrays.toString(newNums) );
    }
}