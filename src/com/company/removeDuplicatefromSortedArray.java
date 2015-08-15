package com.company;

/**
 * Created by v-kevwu on 8/14/2015.
 */
public class removeDuplicatefromSortedArray {

    public int removeDuplicates(int[] nums) {
        int result;
        // write your code here

        if (nums.length == 0)
        {
            return 0;
        }

        int i = 0;
        int j = i+1;
        while (i<j && j < nums.length)
        {
            if(nums[j] != nums[j-1])
            {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
