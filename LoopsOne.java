import java.io.*;

// Main class
public class LoopsOne {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from the console
        BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in));

        // Read an integer input from the user and trim any extra spaces
        int num = Integer.parseInt(bufferedReader.readLine().trim());
        // Close the BufferedReader to release resources
        bufferedReader.close();

        // Loop from 1 to 10 to generate the multiplication table
        for (int i = 1; 1 <= i && i <= 10; i++) {
            // Print the multiplication result in the format "num x i = result"
            System.out.printf("%d x %d = " + num * i + "\n", num, i);
        }
    }
}
