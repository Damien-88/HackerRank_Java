import java.util.*; // Importing the utility package for using Scanner and ArrayList

public class recursion2 {
    public static void main(String[] args) {
        // Create scanner to read input
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(); // number of test cases
            
            // Loop through all test cases
            for (int m = 0; m < t; m++) {
                int a = sc.nextInt(); // Initial value
                int b = sc.nextInt(); // Difference multiplier
                int n = sc.nextInt(); // Length of sequence
                
                // Create list to store equation results
                List<Integer> equation = new ArrayList<>();
                // Calculate first element a + 2^0 * b. Add result to list
                equation.add(a + (int) Math.pow(2, 0) * b);
                
                // Loop through incrementing i n times
                for (int i = 1; i < n; i++) {
                    // Add previous to 2^i * b. Add result to list
                    equation.add(equation.get(i - 1) + (int) Math.pow(2, i) * b);
                }

                // Print all elements list
                for (int l : equation) {
                    System.out.print(l + " ");
                }
                // Print newline after test case
                System.out.println();
            }
        } // Scanner closes
    }

}