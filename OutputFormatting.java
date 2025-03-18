import java.util.Scanner;

// This class demonstrates formatted output in Java
public class OutputFormatting {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Print a line of equal signs as a header
        System.out.println("================================");

        // Loop to read and format input three times
        for (int i = 0; i < 3; i++) {
            // Read a string input from the user
            String s1 = scanner.next();
            // Read an integer input from the user
            int x = scanner.nextInt();
            // Print the string left-aligned in a 15-character field and the integer zero-padded to 3 digits
            System.out.printf("%-15s%03d\n", s1, x);
        }

        // Print a line of equal signs as a footer
        System.out.println("================================");
        
        // Close the scanner to release resources
        scanner.close();
    }
}