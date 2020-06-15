import java.util.Scanner;
import java.time.LocalDateTime;

public class Calculator {

	public static void main(String[] args) {
		LocalDateTime myObj = LocalDateTime.now(); // Create a date object
	    System.out.println(myObj);
		System.out.println("Hello Dan! Welcome to your basic calculator");
		Scanner usrInput = new Scanner(System.in); // for usr inputs
		
		double input1, input2;	//for usr i/p 1,2 and result
		
		double result = 0; 
		
		System.out.println("what\'d you like to perform? (*,/,-,+, ^(sqrt), 2(square)");
		char mathOperator = usrInput.next().charAt(0); // for math operation
		
		if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/') {
			System.out.print("enter first number: ");
			input1 =  usrInput.nextDouble();
			
			System.out.print("enter second number: ");
			input2 = usrInput.nextDouble();
			
			switch(mathOperator)
			{
			case '*':
				result = input1*input2;
				break;
			
			case '/':
				result = input1/input2;
				break;
			
			case '+':
				result = input1+input2;
				break;
				
			case '-':
				result = input1-input2;
				break;
			}
			
		} else if (mathOperator == '^' || mathOperator == '2') {
			
			System.out.print("enter number: ");
			input1 =  usrInput.nextDouble();
			
			switch(mathOperator)
			{
			case '^':  // sqrt
				result = Math.sqrt(input1);
				break;
			
			case '2':
				result = input1*input1;
				break;
			}
		} else {
			System.out.println("Enter a valid operator");
		}
			
		usrInput.close();		
		System.out.println(result);
		
	}
}
