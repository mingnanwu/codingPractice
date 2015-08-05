package com.company;

/**
 * Created by v-kevwu on 7/30/2015.
 */


//strstr (a.k.a find sub string), is a useful function in string operation.
//        You task is to implement this function.
//
//        For a given source string and a target string,
//        you should output the "first" index(from 0) of target string in source string.
//
//        If target is not exist in source, just return -1.
//
//        Example
//        If source="source" and target="target", return -1.
//
//        If source="abcdabcdefg" and target="bcd", return 1.
//
//        Challenge
//        O(n) time.
//
//        Clarification
//        Do I need to implement KMP Algorithm in an interview?
//
//        - Not necessary. When this problem occurs in an interview,
//        the interviewer just want to test your basic implementation ability.


public class strStr {
     public boolean strStrTest(String haystack, String needle)
     {
//         if(a.indexOf(b)>-1)
//         {
//             return true;
//         }
//         return false;


         //KMP algorithms
         if(needle.equals("")) return true;
         if(haystack.equals("")) return false;
         char[] arr = needle.toCharArray();
         int[] next = makeNext(arr);

         for(int i = 0, j = 0, end = haystack.length(); i < end;){
             if(j == -1 || haystack.charAt(i) == arr[j]){
                 j++;
                 i++;
//                 if(j == arr.length) return haystack.substring(i - arr.length);
                 if(j == arr.length) return true;
             }
             if(i < end && haystack.charAt(i) != arr[j]) j = next[j];
         }
         return false;

     }


    private int[] makeNext(char[] arr){
        int len = arr.length;
        int[] next = new int[len];

        next[0] = -1;
        for(int i = 0, j = -1; i + 1 < len;){
            if(j == -1 || arr[i] == arr[j]){
                next[i+1] = j+1;
                if(arr[i+1] == arr[j+1]) next[i+1] = next[j+1];
                i++;
                j++;
            }
            if(arr[i] != arr[j]) j = next[j];
        }

        return next;
    }

}
