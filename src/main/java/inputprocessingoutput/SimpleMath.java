package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {

        public void output() {
            String number1 = getNumber1FromUser();
            String number2 = getNumber2FromUser();
           int f0 = Integer.parseInt(number1);
           int f1 = Integer.parseInt(number2);
           System.out.println(number1 + " + " + number2 + " = " + (f0 + f1) + "\n" + number1 + " - " + number2 + " = " + (f0 - f1) +
                   "\n" + number1 + " * " + number2 + " = " + (f0 * f1) + "\n" + number1 + " / " + number2 + " = " + (f0 / f1));
        }

        private String getNumber1FromUser() {

            System.out.println("What is the first number?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        private String getNumber2FromUser() {

            System.out.println("What is the second number?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        public static void main(String[] args) {
            SimpleMath ecuation = new SimpleMath();
            ecuation.output();
        }
    }

