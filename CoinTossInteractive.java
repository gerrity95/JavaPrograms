import java.util.Scanner;

class CoinTossInteractive
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String goAgain;
		String guess;
		int correct = 1;
		int wrong = 1;
		int counter = 1;
		do
		{
		double randomNumber = Math.random();
		int headsOrTails = (int) Math.round(randomNumber);
		
		System.out.println("Heads or tails?");
		
		guess = sc.nextLine();
		
			while (guess.equalsIgnoreCase("heads"))
			{
				if ( headsOrTails == 0)
				{
					System.out.println("Correct, well done!");
					
					correct++;

				}
				else
				{
					System.out.println("Wrong, it was tails");
					wrong++;
				}
			}
			
			while (guess.equalsIgnoreCase("tails"));
			{
				if (headsOrTails == 1)
				{
					System.out.println("Correct, well done!");
					correct++;
				}
				else
				{
					System.out.println("Wrong, it was heads!");
					wrong++;
				}
			}
			System.out.println("Would you like to go again?");
			goAgain = sc.next();
		
			counter++;
		
		} while (goAgain.equalsIgnoreCase("yes"));
		
		System.out.println("You had " + counter + " tries ");
		System.out.println("You got " + correct + " goes correct");
		System.out.println("You got " + wrong + " goes wrong");
		
	}
}
