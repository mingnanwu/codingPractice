package com.company;

import java.util.*;

/**
 * Created by mingnanwu on 7/9/15.
 */
public class mergeSortedList {
    public void mergeSortedListTest(List<Integer> l1, List<Integer> l2)
    {
//        Method Two lists as parameters, combine the two lists and return one list that contains the elements of
//        both lists, sorted by 'rating' parameter
//
//        Recommendation Objects -rating -int


            List<Integer> result = new ArrayList<Integer>();

            int i = 0;
            int j = 0;
            int cur = 0;
            while (i < l1.size() || j < l2.size()) {
                if (i >= l1.size()) {
                    if (result.get(result.size()-1) != l2.get(j)) {
                        cur++;
                        result.add(l2.get(j));
                        j++;
                        continue;
                    }
                }

                if (j >= l2.size()) {
                    if (result.get(result.size()-1) != l1.get(i)) {
                        cur++;
                        result.add(l1.get(i));
                        i++;
                        continue;
                    }
                }

                int val;
                if (l1.get(i) < l2.get(j))
                {
                    val = l1.get(i++);
                }
                else
                {
                    val = l2.get(j++);
                }



                result.add(val);
            }
        System.out.println("MergeSortedList");
        for(int l = 0; l<result.size();l++)
        {
            System.out.print(" " + result.get(l));
        }
        System.out.println();
    }
}
