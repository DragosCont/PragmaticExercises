package calculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    public void inputFromUser() {
        double principalAmount = getAmountFromTheUser();
        double rateOfInterest = getRateFromUser();
        double percentageRateOfInterest = rateOfInterest / 100;
        int numberOfYears = getNumberOfYearsFromUser();
        int numberOfCompoundsPerYear = getNumberOfCompoundsPerYearFromUser();
        int power = numberOfCompoundsPerYear * numberOfYears;
        double formula = 1 + (percentageRateOfInterest / numberOfCompoundsPerYear);
        double powerFormula = Math.pow(formula,power);
        double finalFormula = powerFormula * principalAmount;

        System.out.println("$" + principalAmount + " invested at " + rateOfInterest + "% for " + numberOfYears + " years \ncompounded "
                + numberOfCompoundsPerYear + " times per year is $" + finalFormula);
    }

    private double getAmountFromTheUser() {

        System.out.println("What is the principal amount?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getRateFromUser() {

        System.out.println("What is the rate?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private int getNumberOfYearsFromUser() {

        System.out.println("What is the number of years?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getNumberOfCompoundsPerYearFromUser(){

        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main( String[] args ) {
        DeterminingCompoundInterest compoundInterest = new DeterminingCompoundInterest();
        compoundInterest.inputFromUser();
    }

}
