package calculations;

import java.util.Scanner;

public class PizzaParty {

    public void inputFromUser() {
        int people = numberOfPeople();
        int pizza = numberOfPizzas();
        int slices = numberOfSlices();
        int piecesPerPerson = (people * pizza) / slices;
        int leftover = (people * pizza) % slices;
        System.out.println(people + " people with " + pizza + " pizzas, each pizza cutted in " + slices + " slices" + "\n"
                + "Each person gets " + piecesPerPerson + " pieces of pizza." + "\n" +
                "There are " + leftover + " leftover pieces.");
    }

    private int numberOfPeople() {

        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int numberOfPizzas() {

        System.out.println("How many pizzas do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int numberOfSlices() {

        System.out.println("How many slices per pizza?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }


    public static void main( String[] args )
    {
        PizzaParty party = new PizzaParty();
        party.inputFromUser();
    }
}