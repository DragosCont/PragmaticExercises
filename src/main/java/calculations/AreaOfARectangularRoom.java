package calculations;


import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfARectangularRoom {

    public void inputFromUser() {
        int length = getTheLengthFromTheUser();
        int width = getTheWidthFromUser();
        int areaSF = width*length;
        double areaSM = areaSF * 0.09290304;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println( "The area is " + "\n" + areaSF + " square feet " + "\n" + (df.format(areaSM)) + " square meters" );
    }

    private int getTheLengthFromTheUser() {

        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private int getTheWidthFromUser() {

        System.out.println("What is the width of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main( String[] args )
    {
        AreaOfARectangularRoom area = new AreaOfARectangularRoom();
        area.inputFromUser();
    }


}
