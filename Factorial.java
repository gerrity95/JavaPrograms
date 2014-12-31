/*
This programs is allows the user to figure out the factorial of a number in putted by the user
Author: Mark Gerrity

*/

import java.util.Scanner;

class Factorial
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = 0;
		int secondNumber = 0;
		
		
		
		System.out.println("Please input the number:");
		firstNumber = sc.nextInt();
		
		secondNumber = firstNumber - 1;
		int factorialNumber = firstNumber * secondNumber;
		
		
		while ( secondNumber > 1)
		{
		secondNumber--;
		
		factorialNumber = factorialNumber * secondNumber;
		
		
		}
		System.out.println("The factorial is: " + factorialNumber);
	}
}
		