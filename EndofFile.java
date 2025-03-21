import java.util.*;

public class EndofFile {
    public static void main(String[] args) {
        int count = 1;
        Scanner fileScanner = new Scanner(System.in);
        
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
        fileScanner.close();
    }
}
