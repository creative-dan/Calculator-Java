
public class ThreadExample extends Thread {
	public static int amount = 100;
	
	public static void main(String[] args) {
		ThreadExample thread = new ThreadExample();
		thread.start();
		while (thread.isAlive()) {
			System.out.println("Waiting");
			amount += 1;
			
			System.out.println(amount);
		}
	}
	
	public void run() {
		amount += 1;
	}
}
