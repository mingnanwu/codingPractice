package com.company;

/**
 * Created by mingnanwu on 7/18/15.
 */
public class quickSort {

    public int[] QuikcSortTest(int[] arr)
    {
        quickSortHelper(arr, 0, arr.length-1);
        return arr;
    }

    private void quickSortHelper(int[] arr, int s, int e)
    {
        if(s==e){
            return;
        }
        int pivot = arr[(e-s)/2+s];
        int l = s;
        int r = e;
        while(l < r){
            while(arr[l]< pivot){
                l++;
            }
            while(arr[r]>pivot){
                r--;
            }
            if(arr[l]==arr[r])
            {
                break;
            }

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }
            quickSortHelper(arr, l + 1, e);
            quickSortHelper(arr, s, l);
    }


}
