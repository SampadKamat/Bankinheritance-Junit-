
public class BankAccount {

	int accNo;
	String CustomerName;
	int Balance;
	double InterestRate;
	public BankAccount(int accNo, String CustomerName, int Balance) {
		// TODO Auto-generated constructor stub
		this.accNo=accNo;
		this.CustomerName=CustomerName;
		this.Balance=Balance;
		
	}



	public int getAccNo() {
		return accNo;
	}



	public String getCustomerName() {
		return CustomerName;
	}



	public int getBalance() {
		return Balance;
	}



	public double getInterestRate() {
		return InterestRate;
	}



	public void deposit(int amount) {
		// TODO Auto-generated method stub
		Balance=Balance+amount;
		
	}

	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		Balance=Balance-amount;
		return true;
		
	}

	public void transfer(BankAccount receiver, int amt) {
		// TODO Auto-generated method stub
		if(this.withdraw(amt)==true)
			{
			amt=amt-(amt/100)*5;
			receiver.deposit(amt);
			System.out.println("Transfer success");
			}
		else
			System.out.println("Transfer Failed");
		
	}

}
