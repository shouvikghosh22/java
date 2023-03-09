package javabegining;
import java.util.Scanner;
public class ForLoopDemo {
	public static void main (String[]args) {
		Scanner input=new Scanner(System.in);
		int n;
		int sum=0;
	
		System.out.println("Enter the value of n: ");
		n=input.nextInt();
 for(int m=1;m<=n; m=m+2) {
	sum=sum+m;
	
 }
 System.out.println("The sum:"+sum);


}
}