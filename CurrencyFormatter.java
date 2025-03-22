import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Main class
public class CurrencyFormatter {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Read a double value from the user
        double value = sc.nextDouble();
        // Close the Scanner to release resources
        sc.close();

        // Define the locale for the US
        Locale usLocale = Locale.US;
        // Get the currency formatter for the US locale
        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        // Format the input value as US currency
        String usFormatted = us.format(value);

        // Define the locale for India (custom locale as "en", "IN")
        Locale indiaLocale = new Locale("en", "IN");
        // Get the currency formatter for the India locale
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        // Format the input value as Indian currency
        String indiaFormatted = india.format(value);

        // Define the locale for China
        Locale chinaLocale = Locale.CHINA;
        // Get the currency formatter for the China locale
        NumberFormat china = NumberFormat.getCurrencyInstance(chinaLocale);
        // Format the input value as Chinese currency
        String chinaFormatted = china.format(value);

        // Define the locale for France
        Locale franceLocale = Locale.FRANCE;
        // Get the currency formatter for the France locale
        NumberFormat france = NumberFormat.getCurrencyInstance(franceLocale);
        // Format the input value as French currency
        String franceFormatted = france.format(value);

        // Print the formatted currency values for each locale
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }

}