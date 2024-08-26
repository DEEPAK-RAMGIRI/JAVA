import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class currencyconverter {

    public static void main(String[] args) {
        Locale india = new Locale("EN", "IN");
        Scanner sc = new Scanner(System.in);// 12324.134
        double currency = sc.nextDouble();

        // Formatting the currency for different locales
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Printing the formatted currency values
        System.out.println("US: " + usFormat.format(currency));
        System.out.println("India: " + indiaFormat.format(currency));
        System.out.println("China: " + chinaFormat.format(currency));
        System.out.println("France: " + franceFormat.format(currency));
    }
}
