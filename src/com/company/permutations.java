package com.company;

import java.util.ArrayList;

/**
 * Created by mingnanwu on 7/4/15.
 */
public class permutations {


    public ArrayList<ArrayList<Integer>> permutationTest(int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        boolean[] isVisited = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            isVisited[i] = false;

        }
        helper(res, new ArrayList<Integer>(),n,isVisited);
        return res;

    }

    private void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur, int n, boolean[] isvisted)
    {
        if(cur.size() == n)
        {
            ArrayList<Integer> toAdd = new ArrayList<Integer>();
            for(int i = 0; i < cur.size(); i ++){
                toAdd.add(cur.get(i));
            }
            res.add(toAdd);
            return;
        }
        for(int i = 1 ; i< n+1 ; i++){
            if (!isvisted[i-1])
            {
                isvisted[i-1] = true;
                cur.add(i);
                helper(res, cur, n, isvisted);
                cur.remove(cur.size() - 1);
                isvisted[i-1] = false;
            }
        }
    }
}
