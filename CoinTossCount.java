import java.util.Scanner;

class CoinTossCount
{
	public static void main(String [] args)
	{

		int counter = 1;
		int heads = 0;
		int tails = 0;
		
		while(counter <= 10000) 
		{
		double randomNumber = Math.random();

		int headsOrTails = (int) Math.round(randomNumber);
			if (headsOrTails == 0)
			{
				heads++;
			}
			else if (headsOrTails == 1)
			{
				tails++;
			}
		counter++;
		}
	

		System.out.println("The amount of heads is: " + heads);
		System.out.println("The amount of tails is: " + tails);
		
		double percentHeads = 0.01 * heads;
		double percentTails = 0.01 * tails;
		
		System.out.println("The percentage of heads is: " + percentHeads + "%.");
		System.out.println("The percentage of tails is: " + percentTails + "%.");
		
	}
}
