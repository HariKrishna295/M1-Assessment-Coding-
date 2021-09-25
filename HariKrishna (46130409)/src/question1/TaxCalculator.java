package question1;
import java.util.Scanner;

public class TaxCalculator 
{
	public static void main (String[] args)
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your monthly income");
		double monthlySalary = scan.nextDouble();
		System.out.println("tax amount to be paid "+taxableAmount(monthlySalary));
	}
	public static double taxableAmount(double monthlySalary)
	{
		double annualIncome = 12 * monthlySalary;
		double taxAmount = 0;
		if (annualIncome<=250000)
			taxAmount = 0;
		else if(annualIncome > 250000 && annualIncome<=500000)
			taxAmount = 0.1 * ( annualIncome - 250000 );
		else if(annualIncome > 500000 && annualIncome<=1000000)
			taxAmount = (0.2 * ( annualIncome - 500000 ) ) + ( 0.1 * 250000 );
		else if(annualIncome > 1000000)
			taxAmount = (0.3 * ( annualIncome - 1000000 ) ) + ( 0.2 * 500000 ) + ( 0.1 * 250000);
		return taxAmount;
	}
}

