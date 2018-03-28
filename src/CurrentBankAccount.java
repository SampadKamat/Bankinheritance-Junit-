
public class CurrentBankAccount extends BankAccount {

	public CurrentBankAccount(int accNo, String CustomerName, int Balance) {
		super(accNo, CustomerName, Balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(int amount)
	{
		
		if(Balance-amount>= -5000)
		{
			Balance=Balance-amount;
			return true;
		}
		else
			System.out.println("Not sufficient balance");
			return false;
	}
}
