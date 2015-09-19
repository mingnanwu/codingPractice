package com.company;

/**
 * Created by v-kevwu on 8/21/2015.
 */
public class findPeak {
    public int findPeak(int[] A) {
        // write your code here

        if (A == null) {
            return -1;
        }
        if (A.length == 0) {
            return 0;
        }

        int start = 0, end = A.length - 1, mid = end / 2;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] < A[mid - 1]) {
                end = mid;
            } else if (A[mid] < A[mid + 1]) {
                start = mid;
            } else {
                return mid;
            }

        }

        mid = (A[start] > A[end]) ? start : end;
        return mid;

    }
}
