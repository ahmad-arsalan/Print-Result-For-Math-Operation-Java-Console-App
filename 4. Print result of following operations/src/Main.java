import java.util.Scanner;

/**
 * 
 */

/**
 * @author Arsalan6ix
 *
 */
public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("This program will solve for four different operations, using user input values.");
		System.out.println("Operation 'a' is number + number * number.");
		System.out.printf("Please enter the first number: ");
		int numA1 = userInput.nextInt();
		System.out.printf("Please enter the second number: ");
		int numA2 = userInput.nextInt();
		System.out.printf("Please enter the third number: ");
		int numA3 = userInput.nextInt();
		System.out.println("The result for " + numA1 + " + " + numA2 + " * " + numA3 + " is " + (numA1 + numA2*numA3) + ".\n");
		
		System.out.println("Operation 'b' is (number+number) % number. % is modulas it returns the remainder of a quotient.");
		System.out.printf("Please enter the first number: ");
		int numB1 = userInput.nextInt();
		System.out.printf("Please enter the second number: ");
		int numB2 = userInput.nextInt();
		System.out.printf("Please enter the second number: ");
		int numB3 = userInput.nextInt();
		System.out.println("The result for " + "(" + numB1 + "+" + numB2 + ")" + " % " + numB3 + " is " + ((numB1+numB2)%numB3) + ".\n");
	
		System.out.println("Operation 'c' is number + number * number / number.");
		System.out.printf("Please enter the first number: ");
		int numC1 = userInput.nextInt();
		System.out.printf("Please enter the second number: ");
		int numC2 = userInput.nextInt();
		System.out.printf("Please enter the third number: ");
		int numC3 = userInput.nextInt();
		System.out.printf("Please enter the fourth number: ");
		int numC4 = userInput.nextInt();
		System.out.println("The result for " + numC1 + " + " + numC2 + "*" + numC3 + " / " + numC4 + " is: " 
		+ (numC1 + (numC2*numC3)/numC4) + ".\n");
		
		System.out.println("Operation 'd' is number + number/number * number + number % number: ");
		System.out.printf("Please enter the first number: ");
		int numD1 = userInput.nextInt();
		System.out.printf("Please enter the second number: ");
		int numD2 = userInput.nextInt();
		System.out.printf("Please enter the third number: ");
		int numD3 = userInput.nextInt();
		System.out.printf("Please enter the fourth number: ");
		int numD4 = userInput.nextInt();
		System.out.printf("Please enter the fifth number: ");
		int numD5 = userInput.nextInt();	
		System.out.printf("Please enter the sixth number: ");
		int numD6 = userInput.nextInt();	
		System.out.println("The result for " + numD1 + " + " + numD2 + " / " + numD3 + " * " + numD4 + " + " + numD5 +
				" % " + numD6 + " is: " + ((numD1 + ((numD2/numD3)*numD4))+numD5%numD6) + ".");
		
		System.out.println("\nGoodbye!");
	}
	

}
