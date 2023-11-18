
public class BankAccount {
	
	int Acc_No;
	String Name;
	int Balance;
	
	

	public BankAccount(int acc_No, int balance, String name) {
		super();
		Acc_No = acc_No;
		this.Name = name;
		this.Balance = balance;
		
	}
	public BankAccount() {
		
	}
	
	public void Display() {
		System.out.println(" The Account No "+Acc_No+" Belonging to "+Name);
		System.out.println(" Has an account Balance of "+Balance+" AED");
	}
	
	public void Withdraw(int amt) {
		Balance = Balance - amt;
		System.out.println(" The amount "+amt+" AED has been withdrawn.");
	}
		public void Deposit(int amt) {
			Balance = Balance - amt;
			System.out.println(" The amount "+amt+" AED has been deposited.");
		
	}
		
		

}
