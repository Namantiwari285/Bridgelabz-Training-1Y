import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {

        double cm;
        double totalInches;
        int feet;
        double inches;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        cm = input.nextDouble();

        totalInches = cm / 2.54;

        feet = (int)(totalInches / 12);
        inches = totalInches % 12;

        System.out.println(
            "Your Height in cm is " + cm +
            " while in feet is " + feet +
            " and inches is " + inches
        );
    }
}
