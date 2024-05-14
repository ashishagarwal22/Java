package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //Question 1: Maximum ofArray
        Scanner in = new Scanner(System.in);

        while(true){
            // To break out of the Infinite Loop
            System.out.println("Do you wish to continue the max problem (Y/N): ");
            if(in.next().charAt(0) == 'N'){
                break;
            }



            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(max(arr));
        }

        // Reverse Problem (Without the infinite loop)
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr){
        int max = 0;  // Here, I am imagining that elements of Array are positive.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //1st method
    static void reverse(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse[i];
        }
    }



    //2nd Method
    static void reverse2(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){ // start < end condition works for both even and odd length of array.
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    // Since we have to use swap again and again in the 2nd method, we will create a function of it and call this.
    // Note, we can write this code directly in the while loop above. But this is cleaner.
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
