package com.company;

public class LongestCommonStringPrefix {

    public static void main(String[] args) {
	// write your code here

        // Longest common string prefix between array of strings
        String[] words = {"flower", "flow", "table"};

        String prefix = longestCommonStringPrefix(words);

        System.out.println(prefix);

    }

    public static String longestCommonStringPrefix(String[] str){

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (str == null || str.length == 0 || str.length > 200){
            return longestCommonPrefix.toString();
        }

        int minimumStringLength = str[0].length();

        for (int i = 1; i < str.length; i++){

            if (str.length < 200) {
                minimumStringLength = Math.min(minimumStringLength, str[i].length());
            }

        }

        for (int i = 0; i < minimumStringLength; i++){

            char cur = str[0].charAt(i);

            for (String s : str){

                if (s.charAt(i) != cur){

                    return longestCommonPrefix.toString();

                }

            }

            longestCommonPrefix.append(cur);

        }

        return longestCommonPrefix.toString();

    }



}
