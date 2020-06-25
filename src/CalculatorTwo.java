import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class CalculatorTwo {
	public static void main(String[] args) throws ScriptException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter expression: ");
		String expression = scan.nextLine();
		
		double a, b;
		
		double result = 0;
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		//String shortName;
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		
		switch (expression) {
		case "+":
		case "-":
		case "*":
		case "/":
			System.out.print("Pahila wala ghoshit karo be: ");
			a = scan.nextDouble();
			System.out.print("Doosra wala ghoshit karo be: ");
			b = scan.nextDouble();
			result = Double.parseDouble(String.valueOf(engine.eval(a + expression + b)));
			break;
			
		case "sqrt":
			System.out.print("Pahila wala ghoshit karo be: ");
			a = scan.nextDouble();
			result =  Double.parseDouble(String.valueOf(engine.eval("Math.sqrt("+a+")")));
			break;
			
		case "sqr" :
			System.out.println("kaa be? square karoge?! toh karo! karte kyu nahi!");
			a = scan.nextDouble();
			result = Math.pow(a, 2);
			break;
		
		default : 
			System.out.println("sahi expression likho be ");
			break;
			
		}
		System.out.println("result is " + result);
	}
}