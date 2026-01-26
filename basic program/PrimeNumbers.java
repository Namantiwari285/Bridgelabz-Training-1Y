
import java.util.*;
public class PrimeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
    int n;
        System.out.print("enter your number-:");
     n= sc.nextInt();
     int flag=0;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            flag =1;
            break;}

        }
    if(n==1){
        System.out.println("1 is neither prime nor composite");
    }
       else if(flag==0){
            System.out.println("the given number is prime");
        }
else{
            System.out.println("the given number is composite");
        }
    }

    }
