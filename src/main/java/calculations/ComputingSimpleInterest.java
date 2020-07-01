package calculations;



import java.util.Scanner;

public class ComputingSimpleInterest {

    public void inputFromUser() {
        double principalAmount = getAmountFromTheUser();
        double rateOfInterest = getRateFromUser();
        double percentageRateOfInterest = rateOfInterest / 100;
        int numberOfYears = getNumberOfYearsFromUser();
        double formula = principalAmount * (1 + (percentageRateOfInterest * numberOfYears));

        System.out.println("After " + numberOfYears + " years at " + rateOfInterest + "%, the investment will be worth $" + formula + ".");
    }

    private double getAmountFromTheUser() {

        System.out.println("Enter the principal:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getRateFromUser() {

        System.out.println("Enter the rate of interest: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private int getNumberOfYearsFromUser() {

        System.out.println("Enter the number of years: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main( String[] args ) {
        ComputingSimpleInterest interest = new ComputingSimpleInterest();
        interest.inputFromUser();
    }

}
