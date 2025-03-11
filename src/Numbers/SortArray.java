package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
int num[]= {19,38,89,78,90,65,453,-3,-5,45};
Arrays.sort(num);
System.out.println(Arrays.toString(num)); 
for(int i=0;i<num.length-1;i++)
{
	System.out.println("After the loop the  at index "+i+"    with values"+num[i]); 

	
}

}
}
