package Numbers;

import java.util.Arrays;

public class Bubblesortmynumber {
	 static void bubbleSortAlgorithm(int array[]) {
		    int size = array.length;
		    
		    for (int i = 0; i < size - 1; i++)
		    
		      for (int j = 0; j < size - i - 1; j++)
		      
		        if (array[j] > array[j + 1]) {
		          int temp = array[j];
		          array[j] = array[j + 1];
		          array[j + 1] = temp;
		          
		        }
		  }
		  
		  public static void main(String args[]) {
		    int[] data = { 69, 5, 86, 21, 24 };
		    
		    bubbleSortAlgorithm(data);
		    
		    System.out.println("The array performing the Bubble Sort Algorithm is:");
		    System.out.println(Arrays.toString(data));
		  }
	}