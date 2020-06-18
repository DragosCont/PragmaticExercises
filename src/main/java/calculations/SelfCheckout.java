package calculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SelfCheckout {

    public void inputs() {
        double priceItem1 = getItem1();
        int quantityOfItem1 = getQuantityOfItem1();
        double priceItem2 = getItem2();
        int quantityOfItem2 = getQuantityOfItem2();
        double priceItem3 = getItem3();
        int quantityOfItem3 = getQuantityOfItem3();
        double subtotal = (priceItem1 * quantityOfItem1) + (priceItem2 * quantityOfItem2) + (priceItem3 * quantityOfItem3);
        double tax = (5.5 / 100) * subtotal ;
        double total = subtotal + tax;
        DecimalFormat subtotalFormat = new DecimalFormat("###.###");
        DecimalFormat taxFormat = new DecimalFormat("###.###");
        DecimalFormat totalFormat = new DecimalFormat("###.###");
        System.out.println("Subtotal: $" + (subtotalFormat.format(subtotal)) + "\n" + "Tax: $" + (taxFormat.format(tax)) + "\n" + "Total: $" + (totalFormat.format(total)));
    }

    private double getItem1() {

        System.out.println("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private int getQuantityOfItem1() {

        System.out.println("Enter the quantity of item 1: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private double getItem2() {

        System.out.println("Enter the price of item 2: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    private int getQuantityOfItem2() {

        System.out.println("Enter the quantity of item 2: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private double getItem3(){

        System.out.println("Enter the price of item 3:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
    private int getQuantityOfItem3(){

        System.out.println("Enter the quantity of item 3:");
        Scanner scanner = new Scanner(System.in);
        return scanner. nextInt();
    }

    public static void main( String[] args )
    {
        SelfCheckout calculator = new SelfCheckout();
        calculator.inputs();
    }

}
