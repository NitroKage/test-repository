import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int num1 = 20;
       	int num2 = 10;
       	int num3 = 30;
       
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
       
        int sum = min + max;
        System.out.println("The sum of the smallest and largest numbers is: " + sum);
    }
}
