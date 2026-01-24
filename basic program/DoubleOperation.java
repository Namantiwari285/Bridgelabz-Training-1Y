import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double r1 = a + b * c;
        double r2 = c + a / b;
        double r3 = a % b + c;

        System.out.println("The results of Double Operations are " + r1 + ", " + r2 + " and " + r3);
    }
}
