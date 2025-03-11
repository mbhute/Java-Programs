package Arraylist1;

import java.util.Arrays;

public class movezeroinstart {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 0, 1, 1, 0};
        moveZeroesToFront(arr);
        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroesToFront(int[] arr) {
        int left = 0;          // Pointer to find 0s
        int right = arr.length - 1;  // Pointer to find 1s

        while (left < right) {
            // If we find a 1 at the left pointer and a 0 at the right pointer, swap them
            if (arr[left] == 1 && arr[right] == 0) {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                // Move both pointers
                left++;
                right--;
            }
            // If left pointer has 0, move it to the right
            if (arr[left] == 0) {
                left++;
            }
            // If right pointer has 1, move it to the left
            if (arr[right] == 1) {
                right--;
            }
        }
    }}