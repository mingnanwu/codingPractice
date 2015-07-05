package com.company;

import java.util.ArrayList;

/**
 * Created by mingnanwu on 7/4/15.
 */
public class combination {



    //Given two integers n and k, return all possible combinations of k numbers out of 1,2,...,n.
    public ArrayList<ArrayList<Integer>> combinationTest(int n, int k){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(),n,k,1);
        return res;

    }

    private void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur, int n, int k, int level)
    {
        if(cur.size() == k)
        {
            ArrayList<Integer> toAdd = new ArrayList<Integer>();
            for(int i = 0; i < cur.size(); i ++){
                toAdd.add(cur.get(i));
            }
            res.add(toAdd);
            return;
        }
        if(cur.size() > k)
        {
            return;
        }

        for(int i = level ; i< n+1 ; i++){
            cur.add(i);
                helper(res, cur, n, k, i + 1);
            cur.remove(cur.size() - 1);
        }
    }




}
