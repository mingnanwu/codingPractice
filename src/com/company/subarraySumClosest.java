package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by v-kevwu on 8/4/2015.
 */


class CustomComparator implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
}
public class subarraySumClosest {

    public ArrayList<Integer> subarraySumClosest(int[] nums) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) {
            return rst;
        }
        if (nums.length == 1) {
            rst.add(0); rst.add(0);
            return rst;
        }
        int[][] culmulate = new int[nums.length][2];
        culmulate[0][0] = nums[0];
        culmulate[0][1] = 0;
        for (int i = 1; i < nums.length; i++) {
            culmulate[i][0] = culmulate[i - 1][0] + nums[i];
            culmulate[i][1] = i;
        }

        Arrays.sort(culmulate, new CustomComparator());
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = culmulate[i + 1][0] - culmulate[i][0];
            if (temp <= min) {
                min = temp;
                start = culmulate[i][1];
                end = culmulate[i + 1][1];
            }
        }
        if (start < end) {
            rst.add(start + 1);
            rst.add(end);
        } else {
            rst.add(end + 1);
            rst.add(start);
        }
        return rst;




    }

}
