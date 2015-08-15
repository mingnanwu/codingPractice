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
//        compareStrings();
//        strStr();
//        longestCommonSubstring();
//        RotateString();
//        ReverseWordsinaString();
//        RemoveElement();
//        ZeroSumSubarray();
//        SubarraySumClosest();
//        ProductOfArrayExcludeItself();
//        PartitionArray();
//        FirstMissingPositive();
//        TwoSum();
//        ThreeSum();
        RemoveDuplicatesFromSortedArray();
        RemoveDuplicatesFromSortedArray2();

	// write your code here
    }


    private static void RemoveDuplicatesFromSortedArray2()
    {
        System.out.println("Remove Duplicates From Sorted Array 2");
        removeDuplicatesFromSortedArray2 rclass = new removeDuplicatesFromSortedArray2();
        int[] arr = {-14,-14,-14,-14,-14,-14,-14,-13,-13,-13,-13,-12,-11,-11,-11,-9,-9,-9,-7,-7,-7,-6,-6,-5,-5,-5,-4,-4,-4,-3,-3,-3,-2,-2,-2,-1,-1,0,0,0,0,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,5,5,6,6,6,7,7,7,7,8,8,8,8,9,9,10,10,11,11,11,11,11,12,12,12,12,13,13,13,13,14,14,15,16,17,18,18,18,20,20,21,21,21,21,21,22,22,22,22,23,24,24,25};
        System.out.println("Given sorted array A = [1,1,1,2,2,3],\n" +
                "\n" +
                "Your function should return length = 5, and A is now [1,1,2,2,3].\n  " + rclass.removeDuplicates(arr));
    }

    private static void RemoveDuplicatesFromSortedArray()
    {
        System.out.println("Remove Duplicates From Sorted Array");
        removeDuplicatefromSortedArray rclass = new removeDuplicatefromSortedArray();
        int[] arr = {1,1,2};
        System.out.println("Given input array A = [1,1,2],\n" +
                "\n" +
                "Your function should return length = 2, and A is now [1,2].\n" + rclass.removeDuplicates(arr));

    }

    private static void ThreeSum()
    {
        System.out.println("3 Sum");
        threeSum tClass = new threeSum();
        int[] arr = {1,0,-1,-1,-1,-1,0,1,1,1};



        System.out.println("S = {-1 0 1 2 -1 -4}, " + tClass.threeSum(arr));
    }


    private static void TwoSum()
    {
        System.out.println("2 Sum");
        twoSum tClass = new twoSum();
        int[] arr ={2,7,11,15};
        int[] result = tClass.twoSum(arr, 9);
        System.out.println("numbers=[2, 7, 11, 15], target=9" + result);
    }

    private static void FirstMissingPositive()
    {
        System.out.println("First Missing Positive");
        firstMissingPositive fClass = new firstMissingPositive();
        int[] arr = {1,2,0};
        int[] arr1= {3,4,-1,1};
        System.out.println("Given [1,2,0] return 3" + fClass.firstMissingPositive(arr));
        System.out.println(", and [3,4,-1,1] return 2." + fClass.firstMissingPositive(arr1));

    }
    private static void PartitionArray()
    {
        System.out.println("Partition Array");
        partitionArray pClass = new partitionArray();
        int[] arr = {3,2,2,1};
        System.out.println("f nums = [3,2,2,1] and k=2, a valid answer is 1. " + pClass.partitionArray(arr,2));

    }

    private static void ProductOfArrayExcludeItself()
    {
        System.out.println("Product of Array Exclude Itself");
        productOfArrayExcludeItself pClass = new productOfArrayExcludeItself();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i< 21;i++) {
            arr.add(2);
        }
        System.out.println("For A = [1, 2, 3], return [6, 3, 2]." + pClass.productExcludeItself(arr));


    }

    private static void SubarraySumClosest()
    {
        System.out.println("Subarray Sum Closest");

        subarraySumClosest sClass = new subarraySumClosest();
        int[] arr = {-3, 1, 1, -3, 5};
        System.out.println("Given [-3, 1, 1, -3, 5], return [0, 2], [1, 3], [1, 1], [2, 2] or [0, 4] "+sClass.subarraySumClosest(arr));


    }

    private static void ZeroSumSubarray()
    {
        System.out.println("Zero Sum Subarray");
        zeroSumSubarray gClass = new zeroSumSubarray();
        int[] arr = {-3, 1, 2, -3, 4};
        System.out.println("Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3]." + gClass.ZeroSumSubarray(arr));
    }

    private static void RemoveElement()
    {
        System.out.println("Remove Element");
        removeElement rClass = new removeElement();
        int [] arr ={0,4,4,0,0,2,4,4};
        System.out.println("Given an array [0,4,4,0,0,2,4,4], value=4\n" +
                "\n" +
                "return 4 and front four elements of the array is [0,0,0,2]" + rClass.removeElemet(arr,4));
    }

    private static void ReverseWordsinaString()
    {
        System.out.println("Reverse Words in a String");
        reverseWordsInString rClass = new reverseWordsInString();
        System.out.println("Given s = \"the sky is blue\",\n" +
                "return \"blue is sky the\"." + rClass.ReverseWordInString("the sky is blue"));

    }

    private static void RotateString()
    {
        System.out.println("Rotate String");
        rotateString rClass= new rotateString();
        System.out.println("for offset=3, return \"efgabcd\"" + rClass.rotateString(3, "abcdefg"));
        System.out.println("for offset=1, return \"gabcdef\"" + rClass.rotateString(1, "abcdefg"));

    }

    private static void longestCommonSubstring()
    {
        System.out.println("Longest common substring");
        longestCommonSubstring lClass= new longestCommonSubstring();
        System.out.println("Given A=\"ABCD\", B=\"CBCE\", return 2    " +lClass.longestCommonSubstring("ABCD","CBCE"));
        System.out.println("Given A=\"abccccccccccde\", B=\"dbcccccabccde\", return 6    " +lClass.longestCommonSubstring("abccccccccccde","dbcccccabccde"));

    }

    private static void strStr()
    {
        System.out.println("strStr");
        strStr sClass = new strStr();
        System.out.println("source=\"source\" and target=\"target\", "+sClass.strStrTest("source", "target"));
        System.out.println("source=\"abcdabcdefg\" and target=\"bcd\","+sClass.strStrTest("abcdabcdefg", "bcd"));


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
