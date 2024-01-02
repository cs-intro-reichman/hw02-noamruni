/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// parse the command line
		int a = Integer.parseInt(args[0]);

		// find and print the divisors
		for (int i = 1; i <= a; i++){
			if ((a % i) == 0){
				System.out.println(i);
			}
		}
	}
}
