import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			
			System.out.println("--------INTEREST--------");
			System.out.println("|                      |");
			System.out.println("| 1. SIMPLE INTEREST   |");
			System.out.println("| 2. SUBTRACTION       |");
			System.out.println("| 3. EXIT              |");
			System.out.println("|                      |");
			System.out.println("------------------------");
		
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			double principal,rate,time,sinterest,cinterest,amount;
			
			
			switch (choice) {
			
			case 1:
				
				System.out.println("Enter Principal: ");
				principal = sc.nextDouble();
				System.out.println("Enter Rate: ");
				rate = sc.nextDouble();
				System.out.println("Enter Time (in years): ");
				time = sc.nextDouble();
				
				sinterest = principal * rate * time;
				
				System.out.println("Simple Interest: " + sinterest + "\n");
				
				
				break;

			case 2:
				
				System.out.println("Enter Principal: ");
				principal = sc.nextDouble();
				System.out.println("Enter Rate: ");
				rate = sc.nextDouble();
				System.out.println("Enter Time (in years): ");
				time = sc.nextDouble();
				
				amount = principal * Math.pow(1 + (rate/100),time);
				cinterest = amount - principal;
				
				System.out.println("Compound Interest: " + cinterest + "\n");
				
				break;
			
			case 3:
				
				System.out.println("Exiting the program..");
				
				break;

			default:
				
				System.out.println("WRONG CHOICE!! ENTER AGAIN..");
			
				break;
			}
			
		}while(choice!=3);
		
		sc.close();
		
	}

}
