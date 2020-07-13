import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
	public static void main(String[] args) throws ScriptException {
		Mortgage myObj = new Mortgage();
		//myObj.main(args);
		
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		
		System.out.println("What'd you like to do today? enter /a for expressions caclulation /n b for others");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		boolean repeat = true;
		
		while (repeat) {
			switch(expression.toUpperCase()) {
			case "A":
				firstMethod();
				break;
			case "B":
				secondMethod();
				break;
			case "C":
				MortgageCalculator.main(args);
				break;
			default:
				System.out.println("you probably mistyped! \n");
				//String loop = "null";
				main(null);
				break;
				
			}
		}			
	}
	
	static void firstMethod() throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		
		System.out.println("Enter the expression");
		Scanner scanner = new Scanner(System.in);
		String expression = scanner.nextLine();
		double result = 0;
		double a,b;
		
		try {
			System.out.println("Answer is "+engine.eval(expression));
		} catch (Exception e) {
			System.out.println("You probably mistyped! go again!");
		}
		main(null);
	}
	
	static void secondMethod() throws ScriptException {
			
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		double a, b;
		double result = 0;
		
		System.out.println("Enter an operator");
		Scanner scanner = new Scanner(System.in);
		String operatorValue = scanner.nextLine();
		String operator = String.valueOf(operatorValue).toUpperCase();
		
		//while (1==1) {
			switch(operator.toUpperCase()) {
			case "+":
			case "-":
			case "*":
			case "/":
				System.out.println("Enter 1st num");
				a =  scanner.nextDouble();
				System.out.println("Enter second number");
				b = scanner.nextDouble();
				result = Double.parseDouble(String.valueOf(engine.eval(a + operator + b)));
				System.out.println("Result of " + a + operator + b +" is " + result);
				break;
				
			case "SQRT":	
			//case "sqrt":
				System.out.println("Enter a number to find its square root");
				a = scanner.nextDouble();
				result = Double.parseDouble(String.valueOf(engine.eval("Math.sqrt(a)")));
				System.out.println("Square root of "+ a + " is " + result);
				break;
			
			case "SQUARE":
			//case "square":
				System.out.println("Enter a number to find it's square: ");
				a = scanner.nextDouble();
				result = Math.pow(a,2);
				System.out.println("Square of "+ a + " is " + result);
				break;
			
			case "EXPONENT":
			//case "exponent":
				System.out.println("Enter the number: ");
				a = scanner.nextDouble();
				System.out.println("Enter it's exponent: ");
				b = scanner.nextDouble();
				result = Math.pow(a,b);
				System.out.println("Result of  "+ a+ " raised to "+ b + " is " + result);
				break;
			
			default:
				System.out.println("Your probably mistyped! Have at it bro");
			}
		//}
		main(null);
		
	}
}