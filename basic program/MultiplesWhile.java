import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {

            int counter = number - 1;

            while (counter > 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                    counter--;
                    continue;
                }

                counter--;
            }

        } else {
            System.out.println("Enter positive number below 100");
        }
    }
}
