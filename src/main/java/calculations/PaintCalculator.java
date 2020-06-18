package calculations;


import java.util.Scanner;

public class PaintCalculator {

    public void inputFromUser() {
        double length = getTheLengthFromTheUser();
        double width = getTheWidthFromUser();
        double areaSF = width*length;
        double gallons = areaSF / 350;

        System.out.println("You will need to purchase " + (Math.ceil(gallons)) + " gallons of paint to cover " + areaSF + " square feet");
    }

    private int getTheLengthFromTheUser() {

        System.out.println("What is the length in feet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getTheWidthFromUser() {

        System.out.println("What is the width in feet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main( String[] args ) {
        PaintCalculator paint = new PaintCalculator();
        paint.inputFromUser();
    }

}
