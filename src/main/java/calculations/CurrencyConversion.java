package calculations;

import java.util.Scanner;

public class CurrencyConversion {

    public void inputFromUser() {
        double euros = getEurosFromTheUser();
        double exchangeRate = getExchangeRateFromUser();
        double amountDollars = euros * exchangeRate;

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is" + " " + amountDollars + " U.S. dollars.");
    }

    private double getEurosFromTheUser() {

        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getExchangeRateFromUser() {

        System.out.println("What is the exchange rate?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main( String[] args ) {
        CurrencyConversion conversion = new CurrencyConversion();
        conversion.inputFromUser();
    }

}
