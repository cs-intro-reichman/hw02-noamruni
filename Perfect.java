/**
 * Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {

        // Parse the command line number and set it to a variable
        int num = Integer.parseInt(args[0]);

        // Set the initial sum of divisors
        int divisorSum = 1;

        // Set the initial text in case of a perfect number
        String perfectDivisorsText = num + " is a perfect number since " + num + " = 1";

        // Iterate over all numbers from 2 to num and find divisors
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // Sum the divisors and add them to the text
                divisorSum += i;
                perfectDivisorsText += (" + " + i);
            }
        }

        // Print in case of a perfect number and non-perfect number
        if (divisorSum == num) {
            System.out.print(perfectDivisorsText);
        } else {
            System.out.print(num + " is not a perfect number");
        }
    }
}