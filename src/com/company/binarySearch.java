package com.company;

/**
 * Created by mingnanwu on 7/5/15.
 */
public class binarySearch {
    public int BinarySearchTest(int[] arr)
    {
        return healper(arr, 0, arr.length-1, 8);

    }

    private int healper(int[] arr, int s, int e, int target)
    {

        int mid = (e - s) /2 + s;

        if(arr[mid]<target){
            return healper(arr, mid+1, e,target);
        }else if(arr[mid]>target) {
            return healper(arr, s, mid, target);
        }
        else
        {
            return mid;
        }
    }
}
