package Numbers;

public class LargestSmallest {

	public static void main(String[] args) {
int[] numbers= {10,20,67,89,78,63};

int largest = numbers[0];
int smallest = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > largest) {
        largest = numbers[i];
    } else if (numbers[i] < smallest) {
        smallest = numbers[i];
    }
}

System.out.println("Largest number: " + largest);
System.out.println("Smallest number: " + smallest);
}}
	


