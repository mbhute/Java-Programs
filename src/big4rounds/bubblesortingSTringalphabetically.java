package big4rounds;

public class bubblesortingSTringalphabetically {

	public static void main(String[] args) {
	        // Example array of strings
	        String[] arr = {"Banana", "Apple", "Cherry", "Mango", "Grapes"};

	        // Call the bubbleSort function
	        bubbleSort(arr);

	        // Print the sorted array
	        System.out.println("Sorted array:");
	        for (String s : arr) {
	            System.out.println(s);
	        }
	    }

	    // Function to perform bubble sort on the array of strings
	    public static void bubbleSort(String[] arr) {
	        int n = arr.length;
	        boolean swapped;

	        // Traverse through all elements of the array
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;

	            // Last i elements are already in place, no need to check them
	            for (int j = 0; j < n - i - 1; j++) {
	                // Compare adjacent elements
	                if (arr[j].compareTo(arr[j + 1]) > 0) {
	                    // Swap arr[j] and arr[j + 1] if they are in wrong order
	                    String temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were swapped by inner loop, then the array is sorted
	            if (!swapped) {
	                break;
	            }
	        }
	}

}
