import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class CalOtherMeth {
	
	public void calculator() throws ScriptException{

        Scanner scan = new Scanner(System.in);        
        boolean continueLoop = true;
        double a, b;
        double result = 0;

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        while(continueLoop) {
        	
        	System.out.println("\nEnter the expression : ");
            String expression = scan.nextLine();
        	
        	switch (expression) {        	
        	       		
            case "+":
            case "-":
            case "/":
            case "*":
                System.out.println("Enter first number");
            	a = scan.nextDouble();
            	System.out.println("Enter second number");
                b = scan.nextDouble();               
                result = Double.parseDouble(String.valueOf(engine.eval(a + expression + b)));
                System.out.println("result is " + result);
                break;
            case "sqrt":
            	System.out.println("Enter the number that you want to square");
                a = scan.nextDouble();
                result = Math.sqrt(a);
                System.out.println(result);
                break;
            case "sqr":
            	System.out.println("Enter the number you want to find square root for");
                a = scan.nextDouble();
                result = Math.pow(a,2);
                System.out.println(result);
                continue;           
                
        	}
        	
        }           
    scan.close();
	}

	public void expr() throws ScriptException {
		
		
		Scanner input = new Scanner(System.in);
	    String expression = input.nextLine();
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String select = expression;
    
    
	    try{
	       System.out.println("Answer is "+engine.eval(select));
	        
	    }catch(Exception e){
	        System.out.println("You probably had a mistake in your expression!");
	    }
   
	}
		
}
	
    public static void main(String[] args) throws ScriptException{
    	    	
    	CalOtherMeth calc = new CalOtherMeth();
    	System.out.println("Do you want to try expression or simple math? Type \"a\" for expression, \"B\" for simple math);");
    	Scanner input = new Scanner(System.in);
    	String select = input.nextLine();
    	
    	switch (select) {
    	
    	case "A":
    	case "a":
    		calc.calculator();
    		break;
    	case "B":
    	case "b":
    		
    	}
    	
    }
}
