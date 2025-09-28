package Project1;

public class login {

		Account a = new Account();

		public void viewAccount(Account ref) {

			System.out.println("ACCOUNT DETAILS ARE");
			System.out.println("ACCOUNT HOLDER NAME:" + ref.name);
			System.out.println("ACCOUNT USERNAME EMAIL:" + ref.email);
			System.out.println("ACCOUNT PHONE NO:" + ref.phno);

		}

		public void checkBalance(Account ref) {
			System.out.println(ref.name + "your balnce are " + ref.bal);

		}

		public void withdraw(Account ref, int amount) {
			
			if (amount < ref.bal) {
				ref.bal -= amount;
				System.out.println("your withdrow amount=" + amount + "your current  balnce are " + ref.bal);
			} else {
				System.out.println("amount is in suffinet");
			}

		}
		
		public void deposit(Account ref,int deposit) {
			
			
			System.out.println(ref.name+" your deposited amount"+deposit);
			ref.bal+=deposit;
			System.out.println("YOUR CURRENT BALNCE"+ref.bal);	
			}
		
		public void logout( ) {
			System.out.println("YOU LOGGED OUT SUCCESFUL");
			;
		}

	}


