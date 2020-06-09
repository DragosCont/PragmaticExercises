package inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    public void theStory() {
        String noun = getTheNounFromUser();
        String verb = getTheVerbFromUser();
        String adjective = getTheAdjectiveFromUser();
        String adverb = getTheAdverbFromUser();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!" );
    }

    private String getTheNounFromUser() {

        System.out.println("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getTheVerbFromUser() {

        System.out.println("Enter a verb: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private String getTheAdjectiveFromUser() {

        System.out.println("Enter an adjective: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private String getTheAdverbFromUser() {

        System.out.println("Enter an adverb: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main( String[] args )
    {
        MadLib story1 = new MadLib();
        story1.theStory();
    }
}

