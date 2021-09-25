package question2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) 
	{
		Account a = new Account(114,"Hari Krishna",LocalDate.now(),4000);
		try
		{
			Transaction.withdraw(a, 8000);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("transaction balance is " +a.getAccountBalance());		
	}
}
