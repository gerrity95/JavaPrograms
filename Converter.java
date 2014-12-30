import java.util.Scanner;

class Converter
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to my converter.\nThis converter acts as both a unit converter and a currency converter.");
		Scanner sc = new Scanner(System.in);
		String goAgain;
		String converterChoice;
		
		
		do
		{
		System.out.println("Would you like to use the currency converter or the unit converter?\n(Currency/Unit)");
		converterChoice = sc.next();
		
			if (converterChoice.equalsIgnoreCase("Currency"));
				{
				
				
				
				}
			else if (converterChoice.equalsIgnoreCase("Unit"));
				{
				
				
				
				}
			else
				{
				System.out.println("Invalid Choice");
				}
		
		System.out.println("Would you like to use the converter again?");
		goAgain = sc.next();
		
		} while (goAgain.equalsIgnoreCase("yes"));