import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	
	BankAccount b= new BankAccount(100,"SAMPAD KAMAT",5000);
	
	@Test
	public void testBankAccount() {
		assertEquals(100,b.accNo);
	}
	
	@Test
	public void testDeposit() {
		b.deposit(200);
		assertEquals(5200,b.getBalance());
	}
	

}
