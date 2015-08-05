package com.company;

/**
 * Created by v-kevwu on 8/3/2015.
 */
public class rotateString {

    public String rotateString(int offset, String strin){

        char[] A = strin.toCharArray();
        if (A == null || A.length == 0) {
            return String.valueOf(A);
        }

        int len = A.length;
        offset %= len;
        reverse(A, 0, len - offset - 1);
        reverse(A, len - offset, len - 1);
        reverse(A, 0, len - 1);

        return String.valueOf(A);
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
