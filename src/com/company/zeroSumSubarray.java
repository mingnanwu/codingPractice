package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by v-kevwu on 8/4/2015.
 * Zero Sum Subarray
 *
 * Given an integer array, find a subarray where the sum of numbers is zero.
 Your code should return the index of the first number and the index of the last number.

 Example
 Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].

 Note
 There is at least one subarray that it's sum equals to zero.
 */
public class zeroSumSubarray {

    public ArrayList<Integer> ZeroSumSubarray(int[] nums) {

        int[] arr = nums;
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();


        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null) {
                result.add(i);
                break;
            }


            // Add sum to hash map
            hM.put(sum, i);
        }
        sum = 0;

        for(int j = result.get(0); j > -1;j--)
        {
            sum = sum + arr[j];
            if(sum == 0)
            {
                result.add(0,j);
                break;
            }
        }


        return result;
    }
}
