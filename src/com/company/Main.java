package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        mergeSortTest();
//        combinationTest();
//        permutationTest();
//        BinarySearchTest();
//        subsetsTest();
//        moveNonzero();
//        mergeSortedList();
//        heapSort();
//        quickSort();
          compareStrings();

	// write your code here
    }

    private static void compareStrings()
    {
//        Compare two strings A and B, determine whether A contains all of the characters in B.
//            The characters in string A and B are all Upper Case letters.
//            Example
//        For A = "ABCD", B = "ABC", return true.
//            For A = "ABCD" B = "AABC", return false.

        System.out.println("compare strings");
        compareStrings cClass = new compareStrings();
        System.out.println(" A = \"ABCD\", B = \"ABC\" "+cClass.compareStringsTest("ABCD","ABC"));
        System.out.println(" A = \"ABCD\" B = \"AABC\" " +cClass.compareStringsTest("ABCD", "AABC"));

    }

    private static void quickSort()
    {
        System.out.println("quickSort");
        quickSort qClass = new quickSort();
        int[] arr = new int[]{06,16,20,26,31,16,19,25,28,35};
        int[] result = qClass.QuikcSortTest(arr);
        for(int i = 0; i < result.length ; i++)
        {
            System.out.println(result[i]);
        }
    }

    private static void heapSort()
    {
        System.out.println("heapSort");
        heapSort hClass = new heapSort();
        int[] arr = new int[]{06,16,20,26,31,16,19,25,28,35};
        int[] result = hClass.HeapSortTest(arr);
        for(int i = 0; i < result.length ; i++)
        {
            System.out.println(result[i]);
        }
    }


    private static void moveNonzero()
    {
        moveZero mClass = new moveZero();
        mClass.moveZeroTest(new int[]{0,0,0,0,1,0,2,0,0,3,0,6,0,9,0,0,0,6,7,5,0,5,0});
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

    private static void mergeSortedList() {
        System.out.println("MergeSorted List");
        mergeSortedList mClass = new mergeSortedList();
        List<Integer> l1 =new ArrayList<Integer>();
        List<Integer> l2 =new ArrayList<Integer>();
        l1.add(1);
        l1.add(5);
        l2.add(2);
        l2.add(3);
        l2.add(6);

        mClass.mergeSortedListTest(l1,l2);
    }



}
