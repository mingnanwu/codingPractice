package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        mergeSortTest();
        combinationTest();
        permutationTest();
        BinarySearchTest();
        subsetsTest();
        moveNonzero(new int[]{0,0,0,0,1,0,2,0,0,3,0,6,0,9,0,0,0,6,7,5,0,5,0});
	// write your code here
    }


    private static int moveNonzero(int[] arr)
    {
        int firstZero = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                firstZero = i;
                break;
            }
        }
        int counter = 0;

        for(int i = firstZero+1; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[firstZero] = arr[i];
                arr[i] = 0;
                firstZero++;
                counter++;
            }
        }
        System.out.println("move non zero in array");
        System.out.println(counter);
        return counter;
    }

    private static void mergeSortTest(){
        System.out.println("MergeSort");
        mergeSort mClass = new mergeSort();
        int[] arr = new int[]{06,16,20,26,31,16,19,25,28,35};
        int[] result = mClass.MergeSortTest(arr);
        for(int i = 0; i < result.length ; i++)
        {
            System.out.println(result[i]);
        }
    }


    private static void BinarySearchTest(){
        System.out.println("BinarySearch");
        binarySearch bClass = new binarySearch();
        int[] arr = new int[]{06,16,19,20,25,26,28,31,35};
        int result = bClass.BinarySearchTest(arr);

            System.out.println(result);
    }

    private static void combinationTest()
    {
        System.out.println("combination");
        combination cClass = new combination();
        ArrayList<ArrayList<Integer>> result = cClass.combinationTest(3, 3);
        for(int i = 0 ; i <result.size();i++)
        {
            ArrayList<Integer> singleresult = result.get(i);
            for(int j = 0 ; j < singleresult.size(); j++)
            {
                System.out.print(singleresult.get(j) + " ");
            }
            System.out.println();
        }
    }
    private static void permutationTest(){
        System.out.println("permutation");
        permutations pClass = new permutations();
        ArrayList<ArrayList<Integer>> result =pClass.permutationTest(3);
        for(int i = 0 ; i <result.size();i++)
        {
            ArrayList<Integer> singleresult = result.get(i);
            for(int j = 0 ; j < singleresult.size(); j++)
            {
                System.out.print(singleresult.get(j) + " ");
            }
            System.out.println();
        }
    }


    private static void subsetsTest(){
        System.out.println("subset");
        subsets sClass = new subsets();
        sClass.subsetTest("ABCD",0);

    }



}
