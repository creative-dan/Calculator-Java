import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.script.ScriptException;

public class MortgageCalculator {
	public static void main(String[] args) throws ScriptException {

		Scanner input = new Scanner(System.in);
		Locale indiaLocale = new Locale("en", "IN");						// set indian locale
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale); // indian currency format

		System.out.print("Enter loan amount: ");
		int principal = input.nextInt();
		
		System.out.print("Enter loan term (in years): ");
		int term = input.nextInt();
		
		System.out.print("Enter interest rate: ");
		double interestRate = input.nextDouble();
		
		interestRate /= 100.0; 
		MortgageCalculator monthlyPay = new MortgageCalculator(); // Create an object of MyClass
	    
		double monthlyPayment = monthlyPay.calMonthlyPay(principal, term, interestRate);
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat interestFormat = NumberFormat.getPercentInstance();

		System.out.println("Loan Amount: " + currencyFormat.format(principal));
		System.out.println("Loan Term: " + term + " years");
		System.out.println("Interest Rate: " + interestFormat.format(interestRate / 100));
		System.out.println("Monthly Payment: " + india.format(monthlyPayment));

		// Now display the monthly balance for
		// the term of the loan

		balanceLeft(principal, term, interestRate, monthlyPayment);
		Calculator.main(args);
	}

	public double calMonthlyPay(int principal, int term, double interestRate) {		
		
		double monthlyRate = interestRate / 12.0; 
		int  termInMonths = term * 12; 
		double monthlyPayment = (principal*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths)); 
		return monthlyPayment;
		 
	}

	static void balanceLeft(int principal, int term, double interestRate, double monthlyPayment) {

		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		double monthlyRate = interestRate / 12.0;
		int termInMonths = term * 12;

		double balance = principal;
		for (int i = 0; i < termInMonths; i++) {
			balance += (balance * monthlyRate);
			balance -= monthlyPayment;
			System.out.println("Amount left to pay after " + (i + 1) + " months: " + india.format(balance));
		}
	}
}