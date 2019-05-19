package loops;

//program to print 1 to 10 using the do-while loop statement.
public class Answer7 {
	public static void doWhileLoop() {
		int i = 1; // Value of i been initialised.
		do // Use of do while loop.
		{

			System.out.println(i);
			i++; // Incrementing the value of the loop.

		} while (i < 11); // Terminating the loop when condition is satisfied.
	}

	public static void main(String[] args) {
		Answer7.doWhileLoop(); // doWhileLoop is a static method so no use of creating Object of class.
		// Directly accessed by class Name.
	}
}
