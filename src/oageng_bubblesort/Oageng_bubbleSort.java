/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oageng_bubblesort;

import java.util.*;

public class Oageng_bubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {14, 33, 15, 82, 32, 11, 90};
        
        // this calls the bubbleSort method
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("");

        // this is used to alllow the user to enter a value
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number that you want to search for in the array:");
            int number = scanner.nextInt();
            int index = Arrays.binarySearch(arr, number);
            
            if (index < 0) {
                System.out.println("Number not found. Would you like to search again? (yes/no)");
                            
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("NO")) {
                    break;
                }
            } else {
                System.out.println("Number found at index " +  index);
                break;
            }
        }
    }
    
    // this is the bubbleSort Method that gets called in the main
    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
