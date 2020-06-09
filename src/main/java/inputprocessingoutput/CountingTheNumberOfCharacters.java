package inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is the input string? ");
        String word1 = scanner.next();
        System.out.println(word1 + " has " + word1.length() + " characters." );
        scanner.close();

    }

}
