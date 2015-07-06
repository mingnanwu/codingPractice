package com.company;

/**
 * Created by mingnanwu on 7/5/15.
 */
public class binarySearch {
    public int BinarySearchTest(int[] arr)
    {
        return healper(arr, 0, arr.length-1, 25);

    }

    private int healper(int[] arr, int s, int e, int target)
    {

        int mid = (e - s) /2 + s;
        if(arr[mid]>target) {
            healper(arr, s, mid, target);
        }else if(arr[mid]<target){
            healper(arr, mid+1, e,target);
        }
        else
        {
            return mid;
        }
        return 1000000;
    }
}
