import java.util.Scanner;
import java.lang.Math;

public class mainModule {
    public static void main(String args[]) {
        log("This is a program to calculate the length of the median of a triangle bisecting a specified side.");

        Scanner usrInput = new Scanner(System.in);

        log("Enter the length of the first side : ");
        double a = usrInput.nextInt();

        log("Enter the length of the second side : ");
        double b = usrInput.nextInt();

        log("Enter the length of the side whose median we have to find: ");
        double c = usrInput.nextInt();

        double toRoot = (2 * (a * a) + 2 * (b * b) - (c * c)) / 4;

        double median = Math.sqrt(toRoot);

        log("The length of the median bisecting the specified side (only two decimal places) is "
                + Math.round(median * 100.0) / 100.0);

    }

    public static void log(String msg) {
        System.out.println(msg);
    }

}