import java.util.Random;

/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get two command-line arguments: an int value
 * that determines how many families to simulate, and an int value
 * that serves as the seed of the random numbers generated by the program.
 * Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
    public static void main(String[] args) {
        // Gets the two command-line arguments
        int numOfExperiments = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);

        // Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);

        // Set the variables
        int numOfAllChildren = 0;
        int numOfFamiliesWithTwoChildren = 0;
        int numOfFamiliesWithThreeChildren = 0;
        int numOfFamiliesWithFourOrMoreChildren = 0;

        // Iterate over number of experiments
        for (int i = 0; i < numOfExperiments; i++) {

            // Initialize variables per experiment
            boolean anyBoys = false;
            boolean anyGirls = false;
            int numOfChildrenInFamily = 0;

            // Run the experiment until there's one boy and one girl
            while (!(anyBoys && anyGirls)) {
                double children = generator.nextDouble();
                if (children < 0.5) {
                    anyBoys = true;
                } else {
                    anyGirls = true;
                }
                numOfChildrenInFamily++;
            }

            // Calculate the total number of children
            numOfAllChildren += numOfChildrenInFamily;

            // Calculate how many families have 2/3/4+ children
            if (numOfChildrenInFamily == 2) {
                numOfFamiliesWithTwoChildren++;
            } else if (numOfChildrenInFamily == 3) {
                numOfFamiliesWithThreeChildren++;
            } else {
                numOfFamiliesWithFourOrMoreChildren++;
            }
        }

        // Calculate the average number of children per family
        double avgChildren = (double) numOfAllChildren / (double) numOfExperiments;

        // Print the results of the average and different families
        System.out.println("Average: " + avgChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + numOfFamiliesWithTwoChildren);
        System.out.println("Number of families with 3 children: " + numOfFamiliesWithThreeChildren);
        System.out.println("Number of families with 4 or more children: " + numOfFamiliesWithFourOrMoreChildren);

        // Evaluate and print the result of the most common occurrence
        if ((numOfFamiliesWithTwoChildren >= numOfFamiliesWithThreeChildren) && (numOfFamiliesWithTwoChildren >= numOfFamiliesWithFourOrMoreChildren)) {
            System.out.println("The most common number of children is 2.");
        } else if ((numOfFamiliesWithThreeChildren > numOfFamiliesWithTwoChildren) && (numOfFamiliesWithThreeChildren >= numOfFamiliesWithFourOrMoreChildren)) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 4 or more.");
        }
    }
}
