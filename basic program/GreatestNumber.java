import java.util.Scanner;
   public class GreatestNumber{
   
   public static void main (String[] args){
	   Scanner sc = new Scanner (System.in);
	   int a,b,c;
	   System.out.print("enter the value of a-:");
	    a =sc.nextInt();
		System.out.print("enter the value of b-:");
		b= sc.nextInt();
		System.out.print("enter the value of c-:");
		c = sc.nextInt();
		if (a>b&&a>c){
			System.out.print(a+" is greatest");
					}
	else if(b>c&&b>a){
			System.out.print(b+" is greatest");
		}
		else{
			System.out.print(c+" is greatest");
		}
	   
	   
   }
   
   
   
   }