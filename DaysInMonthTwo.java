import java.util.Scanner;

class DaysInMonthTwo
{
	public static void main(String [] args)
	{
		String month;
		String askAgain;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Please enter any month: \n");
			month = sc.nextLine();
			System.out.println();
			switch (month)
			{
			case "January": System.out.println("31 days"); break;
			case "February": System.out.println("28 or 29 days"); break;
			case "March": System.out.println("31 days"); break;
			case "April": System.out.println("30 days"); break;
			case "May": System.out.println("31 days "); break;
			case "June": System.out.println("30 days "); break;
			case "July": System.out.println("31 days "); break;
			case "August": System.out.println("31 days "); break;
			case "September": System.out.println("30 days "); break;
			case "October": System.out.println("31 days "); break;
			case "November": System.out.println("30 days "); break;
			case "December": System.out.println("31 days "); break;

			default: System.out.println("Unknown Input"); break;
			}
			System.out.println("\nWould you like to know about any other month? (yes/no)");
			
			askAgain = sc.nextLine();
		}while (askAgain.equalsIgnoreCase("yes"));
		System.out.println("Okay bye!");
	
	}
} 
		
