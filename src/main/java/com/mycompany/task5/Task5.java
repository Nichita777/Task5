/*

Task 5: Bubble Sort - Sorting an Array
Write a Java program to implement the Bubble Sort algorithm to sort an array of integers in
ascending order. The program should:
1. Accept the size of the array and the elements of the array as input.
2. Sort the array using the Bubble Sort technique.
3. Display the array before and after sorting.
4. Count and display the total number of swaps performed during the sorting process.
Example Input:
Enter the size of the array: 6
Enter the elements of the array: 5 3 8 6 2 7 



*/
/*

Nichita Selchin , Student No : sba24331

Repository link : https://github.com/Nichita777/Task5

*/


package com.mycompany.task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input elements of the array
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array before sorting
        System.out.println("Array before sorting:");
        displayArray(array);

        // Sort the array using Bubble Sort and count swaps
        int swapCount = bubbleSort(array);

        // Display the array after sorting
        System.out.println("Array after sorting:");
        displayArray(array);

        // Display the total number of swaps
        System.out.println("Total number of swaps performed: " + swapCount);

        scanner.close();
    }

    // Bubble Sort method
    public static int bubbleSort(int[] array) {
        int swapCount = 0;
        int n = array.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if out of order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapCount++;
                    swapped = true;
                }
            }

            // Break early if no swaps occurred in the current pass
            if (!swapped) {
                break;
            }
        }

        return swapCount;
    }

    // Method to display the array
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
