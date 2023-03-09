package javabegining;
import java.util.Scanner;
public class Input {
public static void main (String[]args) {
	Scanner input=new Scanner(System.in);
	String name;
	System.out.println("Enter the name you love: ");
	name=input.nextLine();
	System.out.print("I LOVE="+name);
}
}
