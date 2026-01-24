import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();

        float add = number1 + number2;
        float sub = number1 - number2;
        float mul = number1 * number2;
        float div = number1 / number2;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }
}
