package inputprocessingoutput;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {

    public void output() {
        String currentAge = getCurrentAgeFromUser();
        int f0 = Integer.parseInt(currentAge);
        String retirementAge = getRetirementAgeFromUser();
        int f1 = Integer.parseInt(retirementAge);
        System.out.println("You have " + (f1 - f0) + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + year + ", so you can retire in " + (year + (f1-f0)) + ".");

    }

    private String getCurrentAgeFromUser() {

        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getRetirementAgeFromUser() {

        System.out.println("At what age would you like to retire?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        RetirementCalculator ecuation = new RetirementCalculator();
        ecuation.output();
    }
}
