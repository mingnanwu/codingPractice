package com.company;

/**
 * Created by v-kevwu on 8/7/2015.
 */
public class firstMissingPositive {
    public int firstMissingPositive(int[] A) {
        // bug 3: when length is 0, return 1;
        if (A == null) {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            // 1: A[i] is in the range;
            // 2: A[i] > 0.
            // 3: The target is different;
            while (A[i] <= A.length && A[i] > 0 && A[A[i] - 1] != A[i]) {
                swap(A, i, A[i] - 1);
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }

    public void swap(int[] A, int l, int r) {
        int tmp = A[l];
        A[l] = A[r];
        A[r] = tmp;
    }
}
