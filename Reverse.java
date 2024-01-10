/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        // Create the string from the command line argument and get its length
        String myString = args[0];
        int length = myString.length();

        // Iterate over all the characters from the end to the beginning and print each character
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }

        // Define the variable middle, and calculate its position based on the string length being even or odd
        int middle;
        if (length % 2 == 0) {
            middle = (length / 2) + 1;
        } else {
            middle = (length - 1) / 2;
        }

        // Print the string middle character
        System.out.println("\n" + "The middle character is " + myString.charAt(middle));
    }
}