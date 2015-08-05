package com.company;

/**
 * Created by v-kevwu on 8/4/2015.
 *
 * Given an array and a value, remove all occurrences of that value in place and return the new length.

 The order of elements can be changed, and the elements after the new length don't matter.

 Example
 Given an array [0,4,4,0,0,2,4,4], value=4

 return 4 and front four elements of the array is [0,0,0,2]
 */
public class removeElement
{
    public int removeElemet(int[] A, int elem)
    {
        if(A.length<=elem)
        {
            return elem;
        }

        int sourceIndex = 0;
        int targetIndex = 0;
        for(int i = 0 ; i<A.length;i++)
        {
            if(A[i] == elem)
            {
                sourceIndex = i;
                targetIndex = i+1;
                break;

            }
        }

        for(int j = targetIndex; j<A.length;j++)
        {
            if(A[j]!=elem){
                //found the non match one
                int temp = A[sourceIndex];
                A[sourceIndex] = A[j];
                A[j] = temp;
                while (sourceIndex<A.length)
                {
                    if(A[sourceIndex] == elem) {
                        break;
                    }
                    sourceIndex++;
                }

            }
        }
        return sourceIndex;
    }
}
