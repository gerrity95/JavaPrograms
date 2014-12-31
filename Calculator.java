/*
This programs is a basic calculator that allows user to do a variety of different things. I will add more options as I learn more things.

*/

import java.util.Scanner;
import java.lang.Math;


class Calculator
{
	public static void main(String [] args)
	{
	
		System.out.println("\nWelcome to my calculator. This program will allow you to make a variety of calculations\n");
		
		
	
	
		Scanner sc = new Scanner(System.in);
		
		String choice;
		String goAgain;
		
		double firstNumber = 0; //These three doubles are going to be used for each function unless the function only needs one in putted number
		double secondNumber = 0;
		double totalNumber = 0;
		
		do
		{
		System.out.println("What would you like to do?\n");
		System.out.println("1. + (Add)\n2. - (Subtract)\n3. / (division)\n4. * (Multiply)\n5. Square\n6.! Factorial\n7. Square Root"); 
		choice = sc.next();
		
			switch (choice)
			{
				case ("+"): 
					System.out.println("\nInput first number:");
					firstNumber = sc.nextDouble();
					System.out.println("\nInput second number:");
					secondNumber = sc.nextDouble();
					totalNumber = firstNumber + secondNumber;
								
					System.out.println("The answer is " + totalNumber);
					
				break; //Two numbers
				
				case ("-"): break; //Two numbers
				case ("/"): break; //Two Numbers
				case ("*"): break; //two numbers
				case ("square"): break; //one number
				case ("!"): break; //one number
				case ("square root"): break; //one number
				
				default: System.out.println("\nInvalid Input\n"); break;
				
			}

		
		System.out.println("Would you like to use the calculator again?");
		goAgain = sc.next();
		
		} while (goAgain.equalsIgnoreCase("yes"));
	}
}