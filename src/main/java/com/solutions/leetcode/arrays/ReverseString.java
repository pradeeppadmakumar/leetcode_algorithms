package com.solutions.leetcode.arrays;

class ReverseString {

    //Reverse String
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
    public void reverseString(char[] s) {
        int forwardIndex = 0;
        int backwardIndex = s.length -1;
        
        while(forwardIndex<backwardIndex){
            char temp = s[backwardIndex];
            s[backwardIndex] = s[forwardIndex];
            s[forwardIndex] = temp;
            forwardIndex++;
            backwardIndex--;
        }
    }

    public static void main(String args[]){
        char[] string = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(string);
        System.out.println(string);
    }
}