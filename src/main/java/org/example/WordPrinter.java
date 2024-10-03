import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");
        String word = scanner.nextLine();
        String reversedWord = new StringBuilder(word).reverse().toString();
        System.out.println("Wyraz od tyłu: " + reversedWord);
    }
}
