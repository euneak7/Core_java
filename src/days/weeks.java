package days;
import java.util.Scanner;


public class weeks {

	public static void main(String [] args) {
 Scanner scanner = new Scanner(System.in);
 
 System.out.print("Enter number 1-5 : ");
 int day= scanner .nextInt();
 if (day==1) {
 System.out.println("MONDAY");
 }
 else if (day==2) {
	 System.out.println("TUESDAY");
 }
 else if (day==3) {
	 System.out.println("WEDNESDAY");
 }
	else if (day==4) {
		 System.out.println("THURSDAY");
	}
	else if (day==5) {
		System.out.println("FRIDAY");
	}
	else {
		System.out.println("INVALID OUTPUT, PLEASE TRYAGAIN BY GIVING THE INPUT BETWEEN 1-5");
 
	}
  scanner.close();
	
 }
 
	
 }


