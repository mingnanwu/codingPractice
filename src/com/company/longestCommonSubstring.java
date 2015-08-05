package com.company;

import com.sun.glass.ui.Size;

/**
 * Created by v-kevwu on 7/31/2015.
 */
public class longestCommonSubstring {

    public int longestCommonSubstring(String s, String t){
        int sSize = s.length();
        int tSize = t.length();

        int[][] matrix = new int[sSize][tSize];

        int maxLenght = 0;

        for(int i = 0 ; i< sSize;i++){
            for(int j = 0; j <tSize;j++){
                if(s.charAt(i) == t.charAt(j))
                {
                    if(i>0 && j>0)
                    {
                        //int temp = Math.max(matrix[i][j-1], matrix[i-1][j]);
                        matrix[i][j] = matrix[i-1][j-1]+1;
                    }else if(i == 0 && j == 0){
                        matrix[i][j] = 1;
                    }else if(i == 0||j == 0) {
                        matrix[i][j] = 1;
                }
                }else{
                    matrix[i][j] = 0;
                }
                maxLenght = Math.max(maxLenght,matrix[i][j]);
            }
        }
        return maxLenght;
    }
}
