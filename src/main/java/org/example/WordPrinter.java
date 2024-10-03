package org.example;

public class WordPrinter {
    public static void main(String[] args) {
        String word = "world"; // zmieniamy na stałą wartość
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println("Wyraz od tyłu: " + reversedWord);
    }
}
