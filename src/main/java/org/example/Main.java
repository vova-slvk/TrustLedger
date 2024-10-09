package org.example;

import java.util.Scanner;
import com.trustledger.models.Transaction;
import com.trustledger.models.TrustRating;
import com.trustledger.models.User;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wyraz: ");
        String input = scanner.nextLine();

        String word = input;
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        System.out.println("Podany wyraz to: " + input);
        System.out.println("Odwrócony wyraz to: " + reversedWord);

        scanner.close();
    }
}