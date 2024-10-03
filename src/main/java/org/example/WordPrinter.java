package org.example;

import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj jakiś wyraz: ");
        String input = scanner.nextLine();

        System.out.println("Wprowadzony wyraz to: " + input);

        scanner.close();
    }
}
