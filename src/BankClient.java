
public class BankClient {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			boolean flag;
			BankAccount b= new BankAccount(100,"SAMPAD KAMAT",5000);
			

			SavingBankAccount s = new SavingBankAccount(100,"SAMPAD KAMAT",5000,9);
			
			CurrentBankAccount c= new CurrentBankAccount(100,"SAMPAD KAMAT",5000);

			
			
			System.out.println("Account Number: "+b.accNo);
			System.out.println("Customer Name: "+b.CustomerName);
			System.out.println("Balnace:"+b.Balance);
			b.deposit(1000); 
			System.out.println("Balance after deposit"+b.Balance);
			b.withdraw(2000);
			System.out.println("Balance after withdraw"+b.Balance);
			s.deposit(2000);
			System.out.println("Balance after deposit"+b.Balance);
			s.withdraw(2000);
			System.out.println("Balance after withdraw"+b.Balance);
			System.out.println("Account Number(Saving): "+s.accNo);
			System.out.println("Customer Name(Saving): "+s.CustomerName);
			System.out.println("Balnace(Saving): "+s.Balance);

			//b.calculateInterest();
			//System.out.println("Balance after withdraw"+b.Balance);
			s.calculateInterest();
			System.out.println("Balnace after adding Interest: "+s.Balance);
			System.out.println("Balnace: "+s.Interest);
			
			
			System.out.println("-----------------CURRENT ACCOUNT----------------------");
			System.out.println("Balnace: "+s.Balance);
			flag=c.withdraw(6000);
			System.out.println("Flag: "+flag);
			System.out.println("Balnace: "+s.Balance);
			System.out.println("-----------------END CURRENT ACCOUNT----------------------");
			
			b=c;

			b=s;

			//c=b;

			//c=s;

			//s=c;
			
			c.transfer(s, 100);
			System.out.println("Balnace: "+s.Balance);

			
		}

	}


