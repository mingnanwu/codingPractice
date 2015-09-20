package com.company;

/**
 * Created by v-kevwu on 8/3/2015.
 */
public class ReverseWordsInString {

    /*
    Example
Clarification

- What constitutes a word?
A sequence of non-space characters constitutes a word.

- Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.

- How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
     */

    public String ReverseWordInString(String s){
        if (s == null || s.length() == 0) {
            return "";
        }

        // split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i) {
            if (!arr[i].equals("")) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);

    }
}
