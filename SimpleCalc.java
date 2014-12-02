import java.util.Scanner;

class SimpleCalc
{
	public static void main(String [] args)
	{
		String goAgain;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("\nPlease enter the first number: ");
			double firstNumber = sc.nextDouble();
			
			System.out.println("\nPlease enter the second number: ");
			double secondNumber = sc.nextDouble();
			
			System.out.println("Please enter what you would like to do with them: ");
			
			System.out.println("1 = addition");
			System.out.println("2 = subtraction");
			System.out.println("3 = multiplication");
			System.out.println("4 = division");
			
			int calculate = sc.nextInt();
			
			switch (calculate)
			{
			case 1: System.out.println(firstNumber + secondNumber); break;
			case 2: System.out.println(firstNumber - secondNumber); break;
			case 3: System.out.println(firstNumber * secondNumber); break;
			case 4: System.out.println(firstNumber / secondNumber); break;
			default: System.out.println("Invalid Input");
			}
		
			
			System.out.println("Would you like to go again? (yes/no)");
			goAgain = sc.next();
		
		} while(goAgain.equalsIgnoreCase("yes"));
	
		System.out.println("Okay, Bye!");
	}
}