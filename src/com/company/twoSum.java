package com.company;

import java.util.HashMap;

/**
 * Created by v-kevwu on 8/13/2015.
 */
public class twoSum {

    /*
    * @param numbers : An array of Integer
    * @param target : target = numbers[index1] + numbers[index2]
    * @return : [index1 + 1, index2 + 1] (index1 < index2)
    */
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length;i++)
        {
            int secondNumber = target - numbers[i];
            if(map.containsKey(secondNumber))
            {
                return new int[]{map.get(secondNumber)+1,i+1};
            }else
            {
                map.put(numbers[i],i);
            }
        }
        return null;
    }

}
