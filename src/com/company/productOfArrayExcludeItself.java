package com.company;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by v-kevwu on 8/4/2015.
 */
public class productOfArrayExcludeItself {
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        ArrayList<Long> result = new ArrayList<Long>();
        if(A.size()==1)
        {
            long a = 1;
            result.add(a);
            return result;
        }

        Long[] left = new Long[A.size()];
        Long[] right = new Long[A.size()];
        left[0] = A.get(0).longValue();
        for(int i = 1; i < A.size();i++)
        {
            left[i] = left[i-1]*A.get(i).longValue();
        }

        right[A.size()-1] = A.get(A.size()-1).longValue();
        for(int i = A.size()-2; i > -1;i--)
        {
            right[i] = right[i+1]*A.get(i).longValue();
        }

        result.add(right[1]);

        for(int i = 1;i<A.size()-1;i++)
        {
            result.add(left[i-1]*right[i+1]);
        }

        result.add(left[A.size()-2]);
        return result;
    }
}
