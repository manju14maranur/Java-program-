package pack;

public class Fibonacci {

	public static void main(String[] args) {
		  int n = 10; // Number of Fibonacci numbers to display
	        int firstTerm = 0, secondTerm = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");

	        // Loop to generate and print Fibonacci numbers
	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + ", ");

	            // Calculate the next term in the sequence
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	        System.out.println(); // Add a newline for better formatting
		// TODO Auto-generated method stub

	}

}
