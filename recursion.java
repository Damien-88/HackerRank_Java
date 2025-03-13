import java.util.*; // Importing the utility package for using Scanner and ArrayList

public class recursion {
    public static void main(String[] args) {
        // Creating a Scanner object for input and using try-with-resources for automatic resource management
        try (Scanner sc = new Scanner(System.in)) {
            // Reading the number of test cases
            int t = sc.nextInt();
            
            // Looping through each test case
            for (int m = 0; m < t; m++) {
                // Reading the value of 'a'
                int a = sc.nextInt();
                // Reading the value of 'b'
                int b = sc.nextInt();
                // Reading the value of 'n'
                int n = sc.nextInt();
                
                // Creating a list to store the sequence
                List<Integer> equation = new ArrayList<>();
                // Adding the first element of the sequence to the list
                equation.add(0 + a * b);
                
                // Looping to generate the rest of the sequence
                for (int i = 1; i < n; i++) {
                    // Adding the next element to the list
                    equation.add(equation.get(i - 1) + a * b);
                    // Incrementing 'a' for the next iteration
                    a++;
                }
                
                // Looping through the list to print the sequence
                for (int l : equation) {
                    // Printing each element followed by a space
                    System.out.print(l + " ");
                }
                // Printing a newline after each test case
                System.out.println();
            }
        } // Scanner resource is closed automatically here
    }
}
