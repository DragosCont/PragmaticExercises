package inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {
    public void hello() {
        String name = getTheNameFromUser();
        System.out.println("Hello, " + name + ", nice to meet you !");
    }

    private String getTheNameFromUser() {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main( String[] args )
    {
        SayingHello salut = new SayingHello();
        salut.hello();
    }



}
