package com.company;

/**
 * Created by v-kevwu on 8/5/2015.
 */
public class partitionArray {
    public int partitionArray(int[] nums, int k) {
        //write your code here

        int l = 0;
        int r = nums.length-1;
        int index = 0;
        int pivot = k;

        while(l < r){
            while(nums[l]<pivot){

                if(l >= r)
                {
                    break;
                }
                l++;

            }
            while(nums[r]>=pivot){

                if(l >= r)
                {
                    break;
                }
                r--;

            }


            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

        }

        for(int i = 0 ; i<nums.length;i++)
        {

            if(nums[i] == k)
            {
                return i;
            }else if(nums[i]>k){

                return i;
            }
        }
        return nums.length;
    }
}
