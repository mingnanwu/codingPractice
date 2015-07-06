package com.company;

import java.util.ArrayList;

/**
 * Created by mingnanwu on 7/5/15.
 */
public class subsets {
    public void subsetTest(String str, int level) {

            helper(str, 0, "");



    }


    private void helper(String str, int level, String cur){
        //System.out.println(cur);
        for(int i = level;i < str.length();i++){
            cur += str.charAt(i);
            //System.out.println(cur);
            helper(str, i + 1, cur);
            System.out.println(cur);
            cur = cur.substring(0,cur.length()-1);
        }
    }


}
