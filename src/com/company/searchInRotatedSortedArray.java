package com.company;

/**
 * Created by v-kevwu on 8/27/2015.
 */
public class searchInRotatedSortedArray {
    public int search(int[] A, int target) {
        // write your code here
        int result = 0 ;
        int start = 0;
        int end = A.length-1;

        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(target == A[mid])
            {
                return mid;
            }else if(A[mid]> A[start]){
                if (A[start] <= target && target < A[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            }else{
                if (A[mid] < target && target <= A[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        if (A[end] == target) {
            result = end;
        } else if (A[start] == target) {
            result = start;
        } else {
            return -1;
        }
        return result;
    }
}
