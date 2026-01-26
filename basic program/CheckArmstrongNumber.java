package loops;
import java.util.Scanner;
public class CheckArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter your number-:");
        n = sc.nextInt();
        int p =n;
int count = 0;
    while(n!=0){
        count = count+1;
        n=n/10;
    }
    int s=p;
    int r=count;
    int sum =0;
    for(int i=r;i>0;i--){
        int ld = p%10;
        int product=1;
        p=p/10;
        for(int j=1;j<=r;j++){
            product=product*ld;
        }
        sum=sum+product;
    }

    if (sum==s){
        System.out.println("the given number is armstrong");
    }
    else{
        System.out.println("the given number is not armstrong");
    }


    }
}
