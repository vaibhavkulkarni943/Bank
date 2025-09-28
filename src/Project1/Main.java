package Project1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Account ac=new Account();
		Bank b=new Bank();
	
		
		while(true) {
		
		System.out.println("WELCOME");
		System.out.println("1.CREATE ACCOUNT");
		System.out.println("2.LOGIN");
		System.out.println("3.exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			
			System.out.println("Enter the name");
			ac.setName(sc.next());
			System.out.println("Enter the email");
			ac.setEmail(sc.next());
			System.out.println("Enter the phone no");
			ac.setPhno(sc.nextDouble());
			System.out.println("YOUR BAL");
			ac.setBal(sc.nextDouble());
			System.out.println("ENter youyr password");
			ac.setPassword(sc.next());
			
			b.CreateAccount(ac);
			break;			
			
		}
		case 2: {
		    System.out.println("ENTER THE EMAIL");
		    String email = sc.next();
		    System.out.println("ENTER THE PASSWORD");
		    String password = sc.next();

		    b.login(email, password);
		    break;
		}

		case 3: {
		    System.out.println("Thank you!");
		    System.exit(0);
		    break;
		}
		default:
		    System.out.println("Invalid choice.");
		    break;

		}
		}
	}

}