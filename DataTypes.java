import java.util.*;

// Main class
public class DataTypes {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            try {
                // Read the input number
                long x = sc.nextLong();
                
                // Print the number and the data types it can fit into
                System.out.println(x + " can be fitted in:");
                
                // Check if the number fits in a byte (-128 to 127)
                if(x >= -128 && x <= 127) System.out.println("* byte");
                
                // Check if the number fits in a short (-32,768 to 32,767)
                if(x >= -32768 && x <= 32767) System.out.println("* short");
                
                // Check if the number fits in an int (-2,147,483,648 to 2,147,483,647)
                if(x >= -2147483648 && x <= 2147483647) System.out.println("* int");
                
                // Check if the number fits in a long (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
                if(x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
            } catch(Exception e) {
                // Handle cases where the input is not a valid long
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        
        // Close the Scanner object
        sc.close();
    }
}