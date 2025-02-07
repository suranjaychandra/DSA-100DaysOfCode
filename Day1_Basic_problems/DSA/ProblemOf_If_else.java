
import java.util.*;

public class ProblemOf_If_else {
    public static String compareNM(int n, int m) {
        // Ensure all cases return a value
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater"; // No need for else-if, just else is fine
        }
    }

    public static void main(String args[]) {
        Scanner cs = new Scanner(System.in); // Create Scanner object

        int n = cs.nextInt(); // Read first integer
        int m = cs.nextInt(); // Read second integer

        ProblemOf_If_else obj = new ProblemOf_If_else();
        String result = obj.compareNM(n, m);
        System.out.println(result);

        cs.close(); // Close Scanner to prevent resource leaks
    }
}
