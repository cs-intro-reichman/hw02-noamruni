
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {

        // Set the Variables
        boolean anyBoys = false;
        boolean anyGirls = false;
        int numOfChildren = 0;
        String childrenList = "";

        // Iterate until there's at least one boy and one girl
        while (!(anyBoys && anyGirls)) {

            // Generate a random number to determine whether the child is a boy or a girl
            double children = Math.random();
            if (children < 0.5) {
                numOfChildren += 1;
                childrenList += "b ";
                anyBoys = true;
            } else {
                numOfChildren += 1;
                childrenList += "g ";
                anyGirls = true;
            }
        }

        System.out.println(childrenList);
        System.out.print("You made it... and you now have " + numOfChildren + " children");
    }
}