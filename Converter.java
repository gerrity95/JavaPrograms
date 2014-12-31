/*
This is a converter program that allows the user to either convert a chosen currency or a chosen unit of measurement 
Author: Mark Gerrity
*/



import java.util.Scanner;

class Converter
{
	public static void main(String [] args)
	{
		System.out.println("\n\nWelcome to my converter.\n\nThis converter acts as both a unit converter and a currency converter.\n");
		Scanner sc = new Scanner(System.in);
		String goAgain;
		String converterChoice;
		
		int currencyFrom = 0;;
		int currencyTo = 0;
		int UnitFrom = 0;
		int UnitTo = 0;
		
		do
		{
		System.out.println("Would you like to use the currency converter or the unit converter?\n(Currency/Unit)\n");
		converterChoice = sc.next();
		
			if (converterChoice.equalsIgnoreCase("Currency"))
				{
				System.out.println("\nOkay, what currency would you like to convert from? (1-4)");
				System.out.println("1. Euro\n2. US Dollar\n3. Pound Sterling\n4. Canadian Dollar");
				currencyFrom = sc.nextInt();
				
					switch (currencyFrom)
					{
						case 1: System.out.println("Euro");
				

						break;
						
						case 2: System.out.println("US Dollar");
						
						
						break;
						
						case 3: System.out.println("Pound Sterling");
						
						
						break;
						
						case 4: System.out.println("Canadian Dollar");
						
						
						break;
						
						default: System.out.println("Invalid Input"); break;
					}
				
				
				}
			else if (converterChoice.equalsIgnoreCase("Unit"))
				{
				System.out.println("\nOkay, what unit would you like to convert?");
				System.out.println("1. Temperature\n2. Weight\n3. Speed\n4. Distance");
				
				
				}
			else
				{
				System.out.println("Invalid Choice");
				}
		
		System.out.println("Would you like to use the converter again?");
		goAgain = sc.next();
		
		} while (goAgain.equalsIgnoreCase("yes"));
	}
}