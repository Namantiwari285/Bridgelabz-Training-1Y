import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1, age2, age3;
        int h1, h2, h3;

        System.out.print("Enter Aman age: ");
        age1 = sc.nextInt();
        System.out.print("Enter Akbar age: ");
        age2 = sc.nextInt();
        System.out.print("Enter Anthony age: ");
        age3 = sc.nextInt();

        System.out.print("Enter Aman height: ");
        h1 = sc.nextInt();
        System.out.print("Enter Akbar height: ");
        h2 = sc.nextInt();
        System.out.print("Enter Anthony height: ");
        h3 = sc.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));

        System.out.println("Youngest age = " + youngest);
        System.out.println("Tallest height = " + tallest);
    }
}
