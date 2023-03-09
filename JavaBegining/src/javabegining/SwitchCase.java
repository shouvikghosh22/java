package javabegining;
import java.util.Scanner;
public class SwitchCase {
public static void main (String[]args) {
	Scanner input=new Scanner(System.in);
	int num;
	System.out.println("Enter a number: ");
	num= input.nextInt();
	switch(num) {
	case 0:
		System.out.println("Zero");
	
case 1:
	System.out.println("One");
	break;
case 2:
	System.out.println("Two");
	break;
case 3:
	System.out.println("Three");
	break;
case 4:
	System.out.println("Four");
	break;
case 5:
	System.out.println("Five");
	break;
	default:
	
		System.out.println("Others");
		break;



}
}

	
	
		
		
	
}


