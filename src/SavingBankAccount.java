
public class SavingBankAccount extends BankAccount {

	int InterestRate,Interest;
	public SavingBankAccount(int accNo, String CustomerName, int Balance,int i) {
		super(accNo, CustomerName, Balance);
		// TODO Auto-generated constructor stub
		this.InterestRate=i;
	}
	public void calculateInterest() {
		// TODO Auto-generated method stub
		Interest=Balance*(InterestRate/100);
		Balance=Balance+Interest;
		System.out.println("Interest: "+Interest);
		System.out.println("Balnace after adding Interest: "+Balance);
	}

}
