import java.util.Scanner;

// This is the main class of the program
public class IntToString {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        try (Scanner sc = new Scanner(System.in)) {
            // Read an integer input from the user
            int number = sc.nextInt();
            
            // Convert the integer to a string
            String str = Integer.toString(number);
            
            // Check if the convertion is of string type
            if (str.getClass().getName().equals("java.lang.String")) {
                // If true, print "Good job"
                System.out.println("Good job");
            } 
            else {
                // If false, print "Wrong answer"
                System.out.println("Wrong answer");
            }
        }
    }

}