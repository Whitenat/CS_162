package edu.osucascades.white;
import java.util.Scanner;

public class Main {

    private static final double TIP_RATE = 0.15; // The hard-coded tip rate
    
    public static void main(String[] args) {
        System.out.print("Please enter the total bill: $");
        Scanner keyboard = new Scanner(System.in);
        double bill = keyboard.nextDouble();
        System.out.printf("\tSuggested tip: $%.2f", bill * TIP_RATE);
    }
}
