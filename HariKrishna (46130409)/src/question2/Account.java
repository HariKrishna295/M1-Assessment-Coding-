package question2;
import java.time.LocalDate;

public class Account {
	int accountNumber;
    String accountHolderName;
    LocalDate openedDate;
    double balance;
    public Account(){ }
	public Account(int accountNumber,String accountHolderName,LocalDate openedDate,double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.openedDate=openedDate;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber){ this.accountNumber =accountNumber;}
	public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName;}
	public void setOpenedDate(LocalDate openedDate){this.openedDate=openedDate;}
	
	public void setAccountBalance (double balance)
	{ 
		this.balance = balance;
		validateBalance(balance);
		}
	
	public int getAccountNumber()
	{ 
		return accountNumber;
	}
	public String getAccountHoldername() 
	{ 
		return accountHolderName;
	}
	public double getAccountBalance()
	{ 
		return balance;
	}
	public LocalDate getOpenedDate()
    {
       return openedDate;
    }
	public String validateBalance(double balance)
	{
		if(balance<5000)	
		{
			return("no minimum balance available");
		}
		else
			return("minimum balance available");		       
	}

	public String toString()
	{
		return "Account Number : " + getAccountNumber() +"\nAccountHolderName : " + getAccountHoldername() +"\nLocalDate" + getOpenedDate() + "\nAccount Balance: " + getAccountBalance() ;
	}
}
