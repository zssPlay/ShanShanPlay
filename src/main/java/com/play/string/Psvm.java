package com.play.string;

public class Psvm {
    public static void main(String[] args) {
        String[] strs = {"tom","tomandjreey","to"};
        Solution solution = new Solution();
        String commonPrefix = solution.longestCommonPrefix(strs);
        System.out.println(commonPrefix);
    }
}
