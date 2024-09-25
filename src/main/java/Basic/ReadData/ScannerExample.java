package Basic.ReadData;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input something:");
        String something = scanner.nextLine();
        System.out.println("Inpur: "+something);

        // Close the scanner
        scanner.close();
    }
}
