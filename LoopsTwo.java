import java.util.*;

// Series: (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ..., 
// (a + 2^0 * b + 2^1 * b + ... + 2^(n-1) * b)

public class LoopsTwo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Read the number of test cases
        int t = in.nextInt();

        // Loop through each test case
        for (int i = 0; i < t; i++) {
            // Read the values of a, b, and n for the current test case
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Create a list to store the sequence of numbers
            List<Integer> equation = new ArrayList<>();

            // Calculate the first term of the sequence and add it to the list
            equation.add(a + (int) Math.pow(2, 0) * b);

            // Generate the remaining terms of the sequence
            for (int l = 1; l < n; l++) {
                // Add the next term to the list by using the previous term
                equation.add(equation.get(l - 1) + 
                (int) Math.pow(2, l) * b);
            }

            // Print all terms of the sequence for the current test case
            for (int m : equation) {
                System.out.print(m + " ");
            }
            // Print a newline after each test case
            System.out.println();
        }
        // Close the Scanner object to release resources
        in.close();
    }
}