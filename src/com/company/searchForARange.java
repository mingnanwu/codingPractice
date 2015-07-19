package com.company;

/**
 * Created by mingnanwu on 7/9/15.
 */
public class searchForARange {
//    Given a sorted array of integers, find the starting and ending position of a given target value.
//
//    Your algorithm's runtime complexity must be in the order of O(log n).
//
//    If the target is not found in the array, return [-1, -1].
//
//    For example,
//
//    Given [5, 7, 7, 8, 8, 10] and target value 8,
//
//            return [3, 4].

    public void searchForARangeTest(int[] arr,int target)
    {
           helper(arr,target,0,arr.length);
    }
    public void helper(int[] arr, int target, int s, int e)
    {

        int mid = (e-s)/2 + s;
        if(target == arr[mid])
        {
            return;
        }
        if(arr[mid]>target)
        {
            helper(arr,target,s,mid);
        }
        else
        {
            helper(arr,target,mid+1,e);
        }
    }

}
