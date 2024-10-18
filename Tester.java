import java.util.Scanner;

public class Tester{

public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter 3 numbers: ");
int arr[] = new int[3];

for(int i=0; i<3; i++){

	arr[i] = sc.nextInt();

}

int min = arr[0];
int max = arr[0];


for(int i=0; i<3; i++){

	if(arr[i] < min){
		min = arr[i];
	}
	
	if(arr[i] > max){
		max = arr[i];
	}

}

System.out.println("Maximum: " + max + ", Minimum: " + min);
System.out.println("Sum of minimum and maximum: " + (min+max));

}

}
