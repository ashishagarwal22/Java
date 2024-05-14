package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

// 2nd File in Function Lesson
/*
Refer the **Notes --> Function Section** for below script.
 */
public class MultiDimension {
    public static void main(String[] args) {
        // 2d Array is somewhat like matrix.
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        // We can declare 2d Array by 2 Square parentheses
        // First is for the number of rows. ANd second is for the number of columns.
        // This is basically an Array of arrays.
        // int[][] arr = new int[3][3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Each array inside the bigger array is an object in itself.
        // According to this logic, it can have it's own different length.
        int[][] varArr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(varArr[2][3]);

        /*
        We cannot insert values of every element in Array directly after initialising it.
        Meaning, if we want to assign value to every element in Array in one go,
        we have to do so while initialising it or declaring it.
        Otherwise we have to use for loop to assign values to each element.

        // This will give error.
        int[][] varArr2D = new int[3][];
        varArr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
         */

        // Input for multi dim array
        Scanner input = new Scanner(System.in);
        int[][] varArr2D = new int[3][3];

        for (int row = 0; row < varArr2D.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                varArr2D[row][column] = input.nextInt();
            }
        }

        // For printing above Assigned Array
        for (int row = 0; row < varArr2D.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < varArr2D.length; row++) {
            System.out.println(Arrays.toString(varArr2D[row]));
        }

        // Above Array printing with enhanced for loop
        // This is important to note for future problem-solving with Optimisation.
        for(int[] row: varArr2D){
            System.out.println(Arrays.toString(row));  // You can replace the variable name row to anything and it'll still work.
        }
        // See, How easy it is

    }
}
