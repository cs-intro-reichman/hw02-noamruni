/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {

        // Parse the command line
        int n = Integer.parseInt(args[0]);

        // Iterate over rows and columns
        for (int row = 1; row <= n; row++) {

            // Space before even rows
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
