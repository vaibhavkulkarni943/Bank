package Project1;
import java.util.Scanner;

	public class Bank {
		Account a = new Account();

		Account arr[] = new Account[5];

//		Account accountLogin = null;

		public void CreateAccount(Account acc) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) {
					arr[i] = acc;
					System.out.println("ACCOUNT CREATED SUCCESSFUL");
					return;
				}
			}
			System.out.println("ACCOUNT ARRAY FULL");
		}

		public void login(String email, String pass) {
			Scanner sc = new Scanner(System.in);
			boolean found = false;
			for (Account a : arr) {
				if (a != null && a.email.equals(email) && a.password.equals(pass)) {
					System.out.println("YOU LOGGED IN SUCCESSFUL");
//					accountLogin = a;
					found = true;

					while (true) {
						System.out.println("WELCOME TO PENTAGOAN SPACE" + a.name);

						System.out.println("1.VIEW ACCOUNT");
						System.out.println("2.CHECK BALANCE");
						System.out.println("3.WITHDRAW");
						System.out.println("4.DEPOSIT");
						System.out.println("5.LOGOUT");

						int choice = sc.nextInt();
						login l = new login();

						switch (choice) {
						case 1: {

							l.viewAccount(a);
							break;

						}
						case 2: {
							l.checkBalance(a);
							break;

						}
						case 3: {
							System.out.println("ENTER AMOUNT YOU WANT TO WITH DRAW");
							int amount = sc.nextInt();
							l.withdraw(a, amount);
							break;
						}
						case 4: {
							System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
							int deposit=sc.nextInt();
							l.deposit(a, deposit);
							break;

						}
						case 5: {
						
							l.logout();
							break;

						}
						default:
							throw new IllegalArgumentException("Unexpected value: " + choice);
						}
					}

				}
				break;
			}
			if (!found) {
				System.out.println("INVALID CREDENTIALS");
			}

		}

	}


