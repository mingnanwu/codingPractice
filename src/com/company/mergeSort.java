package com.company;

/**
 * Created by mingnanwu on 7/4/15.
 */
public class mergeSort {

    public int[] MergeSortTest(int[] arr)
    {
        mergeSortHelper(arr, 0, arr.length);
        return arr;
    }

    private void mergeSortHelper(int[] arr, int s, int e)
    {
        int mid = (e-s)/2 + s;
        if(s >= e || mid == 0)
        {
            return;
        }
        mergeSortHelper(arr, s, mid);
        mergeSortHelper(arr, mid+1, e);
        doMerge(arr, s,mid,e);

    }
    private void doMerge(int[] arr, int s, int mid, int e){

        int [] left = new int [mid-s];
        int [] right = new int [e-mid];


        int counter = 0;
        for(int i = s; i < mid; i++){
            left[counter] = arr[i];
            counter++;
        }
        counter = 0;
        for(int j = mid; j<e; j++){
            right[counter] = arr[j];
            counter++;
        }
        int leftIndex = 0;
        int rightIndex = 0;

        for(int k = s; k < e; k++){
            if(rightIndex >= right.length)
            {
                arr[k] = left[leftIndex];
                leftIndex++;
                continue;
            }

            if(leftIndex >= left.length)
            {
                arr[k] = right[rightIndex];
                rightIndex++;
                continue;
            }
            if(left[leftIndex]>right[rightIndex])
            {
                arr[k] = right[rightIndex];
                rightIndex++;

            }else{
                arr[k] = left[leftIndex];
                leftIndex++;
            }
        }
    }
}
