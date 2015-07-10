package com.company;

/**
 * Created by mingnanwu on 7/9/15.
 */
public class moveZero {


    public int moveZeroTest(int[] arr) {

        System.out.println("MoveZeros");
        System.out.println("Input");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int firstZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                firstZero = i;
                break;
            }
        }
        int counter = 0;

        for (int i = firstZero + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[firstZero] = arr[i];
                arr[i] = 0;
                firstZero++;
                counter++;
            }
        }
        System.out.println("Output");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println(counter);
        return counter;
    }
}
