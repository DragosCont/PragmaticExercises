package inputprocessingoutput;

import java.util.Scanner;

public class  PrintingQuotes {

    public void theQuote() {
        String quote1 = getTheQuoteFromTheUser();
        String author = getTheAuthorFromUser();
        System.out.println( author + " says, " + "\"" + quote1 + "\"" );
    }

    private String getTheQuoteFromTheUser() {

        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getTheAuthorFromUser() {

        System.out.println("Who said it?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main( String[] args )
    {
        PrintingQuotes quote = new PrintingQuotes();
        quote.theQuote();
    }
}
