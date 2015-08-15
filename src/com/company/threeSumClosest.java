package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by v-kevwu on 8/14/2015.
 */
public class threeSumClosest {


    public int threeSumClosest(int[] num, int target) {
        if(num==null || num.length<3)
            return 0;

        int min = Integer.MAX_VALUE;
        int val = 0;
        Arrays.sort(num);
        for(int i = 0; i<=num.length-3;i++){
            int low = i+1;
            int high = num.length-1;
            while(low<high){
                int sum = num[i]+num[low]+num[high];
                if(Math.abs(target-sum)<min){
                    min = Math.abs(target-sum);
                    val = sum;
                }

                if(target==sum){
                    return val;
                }else if(target>sum){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return val;
    }
}
