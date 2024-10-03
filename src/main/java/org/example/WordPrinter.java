package org.example;

import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj jakiś wyraz: ");
        String input = scanner.nextLine();

        // Wypisanie wyrazu od tyłu
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Wprowadzony wyraz od tyłu to: " + reversed);

        scanner.close();
    }
}
