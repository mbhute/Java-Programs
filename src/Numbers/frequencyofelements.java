package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class frequencyofelements {

	public static void main(String[] args) {
int arr[]= {3,4,4,5,6,8,8,9};
int count=0;
for(int i=0;i<arr.length-1;i++)
{
	
	for(int j=i+1;j<arr.length-1;j++)
			{
			if(arr[i]==arr[j])
			{
				count=count++;
				   System.out.print(arr[i]);
			}
			
			
	}
	System.out.println("the count is "+count);
	
}
	}

}
