/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
       // Set two variables
        int generatedNumber = 0;
        int lastNumber;

        // iterate when generated number is greater or equal then the last generated number
        do {
            lastNumber = generatedNumber;
            generatedNumber = (int) (Math.random() * 10);
            // print only when the generated number is greater or equal than the last generated number
            if (generatedNumber >= lastNumber) {
                System.out.print(generatedNumber + " ");
            }
        } while (generatedNumber >= lastNumber);
    }
}



