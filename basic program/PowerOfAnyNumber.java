
import java.util.Scanner;
public class PowerOfAnyNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter the value of a-:");
        a =sc.nextInt();
        System.out.print("enter your power-:");
        b = sc.nextInt();
        int product =1;
        for(int i=1;i<=b;i++){
            product=product*a;
        }
        System.out.println(product);
    }
}
