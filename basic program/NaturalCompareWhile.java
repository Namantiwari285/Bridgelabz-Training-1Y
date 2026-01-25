import java.util.Scanner;

public class NaturalCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int i = 1, sumLoop = 0;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("While loop sum = " + sumLoop);
            System.out.println("Formula sum = " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
