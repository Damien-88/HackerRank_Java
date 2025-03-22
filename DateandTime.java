import java.io.*;
import java.util.*;

// Class containing the method to find the day of the week
class Result {

    // Method to find the day of the week for a given date
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        // Set the calendar to the specified date
        cal.set(year, month - 1, day); 
        // Get the day of the week in full uppercase format
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}

// Main class to handle input and output
public class DateandTime {

    public static void main(String[] args) {
        try (
            // Create a BufferedReader to read input from the console
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            // Create a BufferedWriter to write output to a file specified by the environment variable OUTPUT_PATH
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))
        ) {
            // Read the input line, trim trailing spaces, and split it into an array
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            // Parse the month from the input
            int month = Integer.parseInt(firstMultipleInput[0]);

            // Parse the day from the input
            int day = Integer.parseInt(firstMultipleInput[1]);

            // Parse the year from the input
            int year = Integer.parseInt(firstMultipleInput[2]);

            // Call the findDay method to get the day of the week
            String res = Result.findDay(month, day, year);

            // Write the result to the output file
            bufferedWriter.write(res);
            // Add a new line after the result
            bufferedWriter.newLine();
        } 
        // Handle any IOExceptions that may occur
        catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

}
