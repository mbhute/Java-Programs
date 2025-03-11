package Numbers;

public class Largest {

	public static void main(String[] args) {
int [] num= {12,90,30,120,110,40};
int smallest=num[0];
int largest =num[0];
int k=num.length;

for(int i=0;i<k-1;i++) {
	if(	num[i]<smallest)
	{
		smallest=num[i];
		
	}
		
	if(num[i]>largest)
	{
		largest=num[i];
		
	}
}
System.out.println("The smallest number is "+smallest);
System.out.println("The Largest number is "+largest);
	}

}
