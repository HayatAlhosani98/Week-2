
public class Driver {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(12, 2000, "Hayat");
		ba.Display();
		ba.Deposit(500);
		ba.Display();
		ba.Withdraw(50);
		ba.Display();

	}
}
