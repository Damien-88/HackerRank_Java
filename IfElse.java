import java.util.Scanner;

// Main class definition
public class IfElse {
    // Create a Scanner object for user input
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Read an integer input from the user
        int num = scanner.nextInt();
        // Skip any newline or extra characters after the input
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // Check if the number is odd
        if (num % 2 != 0) {
            // Print "Weird" if the number is odd
            System.out.println("Weird");
        } else {
            // Check if the number is in the range [2, 5]
            if (num >= 2 && num <= 5) {
                // Print "Not Weird" for numbers in this range
                System.out.println("Not Weird");
            } 
            // Check if the number is in the range [6, 20]
            else if (num <= 20) {
                // Print "Weird" for numbers in this range
                System.out.println("Weird");
            } 
            // Check if the number is greater than 20
            else if (num > 20) {
                // Print "Not Weird" for numbers greater than 20
                System.out.println("Not Weird");
            }
            // Print "Odd number" (this line is misplaced and will always execute for even numbers)
            System.out.println("Odd number");
        }
    }
}