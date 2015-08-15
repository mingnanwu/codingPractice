package com.company;

/**
 * Created by v-kevwu on 8/14/2015.
 */
public class removeDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        // write your code here
        if (nums.length == 0)
        {
            return 0;
        }

        int i = 0;
        int j = i+1;
        int counter = 0;
        while (i<j && j < nums.length)
        {
            if(nums[j] != nums[j-1])
            {

                if(counter>=2)
                {
                    i++;
                    nums[i] = nums[i-1];
                }
                i++;
                nums[i] = nums[j];
                counter = 0;
            }
            counter++;
            j++;
        }
        return i+1;
    }
}
