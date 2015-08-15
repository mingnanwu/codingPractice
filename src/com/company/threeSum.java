package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by v-kevwu on 8/13/2015.
 */
public class threeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {

//        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//        Arrays.sort(numbers);
//
//        for(int j = 0; j < numbers.length;j++)
//        {
//            if(j+1 == numbers.length){
//                break;
//            }
//            if(numbers[j]==numbers[j+1]){
//                continue;
//            }
//
//            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//            int target = 0-numbers[j];
//            for(int i = j+1; i < numbers.length;i++)
//            {
//
//                int secondNumber = target - numbers[i];
//                if(map.containsKey(secondNumber))
//                {
//                    if(numbers[i] == numbers[i-1]){
//                        continue;
//                    }
//                    ArrayList<Integer> singal = new ArrayList<>();
//                    singal.add(numbers[j]);
//                    singal.add(secondNumber);
//                    singal.add(numbers[i]);
//                    result.add(singal);
//                }else
//                {
//                    map.put(numbers[i],i);
//                }
//            }
//        }
//
//
//        return result;


        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();


        if (num.length < 3)
            return result;

        // sort array
        Arrays.sort(num);

        for (int i = 0; i < num.length - 2; i++) {
            // //avoid duplicate solutions
            if (i == 0 || num[i] > num[i - 1]) {

                int negate = -num[i];

                int start = i + 1;
                int end = num.length - 1;

                while (start < end) {
                    //case 1
                    if (num[start] + num[end] == negate) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);

                        result.add(temp);
                        start++;
                        end--;
                        //avoid duplicate solutions
                        while (start < end && num[end] == num[end + 1])
                            end--;

                        while (start < end && num[start] == num[start - 1])
                            start++;
                        //case 2
                    } else if (num[start] + num[end] < negate) {
                        start++;
                        //case 3
                    } else {
                        end--;
                    }
                }

            }
        }

        return result;




    }




}
