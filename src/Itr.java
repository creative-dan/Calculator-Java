import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Itr extends Thread{

		static void CheckAge(int Age) {
			if (Age < 18) {
				throw new ArithmeticException("Access denied, you need to be at least 18");
			} else {
				System.out.println("Access granted");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int myAge = new int();
		
		CheckAge(20);
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Merc");
		cars.add("Audi");
		cars.add("Nissan");
		
		//get iterator
		Iterator<String> it = cars.iterator();
		
		//print items
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
		
			
		Integer myInt = 555555;
		Double myDouble = 5.69;
		Character myChar = 'A';
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
			
		String myString = myInt.toString();
		System.out.println(myString.length());
		
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("something went wrogn!");
		} finally {
			System.out.println("try catch finished");
		}
		
		Pattern pattern = Pattern.compile("W3schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit w3Schools!");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found!");
		} else {
			System.out.println("nahi mila");
		}
		
		Itr thread = new Itr();
		thread.start();
		System.out.println("outside the thread");
	
		
		
		
	}
	public void run() {
		System.out.println("This is in");
	}

}
