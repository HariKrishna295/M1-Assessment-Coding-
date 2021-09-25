package question2;
import question2.InsufficientBalanceException;

public class Transaction 
{
	public static void deposit(Account account,double amount)
	{
		account.setAccountBalance(account.getAccountBalance());
	}
	public static void withdraw(Account account,double amount) throws InsufficientBalanceException
	{
		double balance = account.getAccountBalance();
		if(balance-amount >=5000)
			account.setAccountBalance(balance-amount);
		else
			throw new InsufficientBalanceException
			(balance-amount+"is not sufficient minimum  deposit");
	}

}