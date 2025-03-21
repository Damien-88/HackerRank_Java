import java.util.*;

// Main class
public class EndofFile {
    public static void main(String[] args) {
        // Initialize a counter to keep track of line numbers
        int count = 1;

        // Create a Scanner object to read input from the user
        Scanner fileScanner = new Scanner(System.in);
        
        // Loop through the input until there is no more input
        while (fileScanner.hasNext()) {
            // Read the next line of input
            String line = fileScanner.nextLine();
            // Print the line number followed by the line content
            System.out.println(count + " " + line);
            // Increment the line counter
            count++;
        }
        // Close the Scanner to release resources
        fileScanner.close();
    }
}