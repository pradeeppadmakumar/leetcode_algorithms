package com.solutions.leetcode.string;

class FirstUniqueCharacterInAString {
    //First Unique Character in a String
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

    public int firstUniqChar(String s) {
        char[] stringAsCharArray = s.toCharArray();
        int[] charecterBuffer = new int[128];
        
        for(char charecter : stringAsCharArray){
            charecterBuffer[(int) charecter] +=1;
        }
        
        for(int index=0; index<stringAsCharArray.length; index++){
            if(charecterBuffer[(int) stringAsCharArray[index]] == 1){
                return index;
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

        System.out.println(firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }
}