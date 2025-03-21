import java.util.Scanner; // Importing the Scanner class for user input

public class StaticInitializerBlock {
    
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the breadth value from the user
        int breadth = sc.nextInt();
        // Read the height value from the user
        int height = sc.nextInt();
        
        // Check if either breadth or height is negative
        if (breadth <= 0 || height <= 0) {
            // Print an exception message if the dimensions are invalid
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } 
        else {
            // Calculate the area of the parallelogram
            int area = breadth * height;
            // Print the calculated area
            System.out.println(area);
        } 
        
        // Close the Scanner object to release resources
        sc.close();
    }
    
}