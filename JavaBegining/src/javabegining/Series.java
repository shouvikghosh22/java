package javabegining;
import java.util.Scanner;
public class Series {
public static void main (String[]args) {
Scanner input=new Scanner(System.in);
int n;
System.out.println("The value of n: ");
n=input.nextInt();
int row;
int col;
for(row=1;row<=n;row++) {
	for(col=1;col<=row;col++) {
		System.out.print(" "+col);
	}
	System.out.println();
}
}
}