import java.util.Scanner;

class CoinToss
{
	public static void main(String [] args)
	{
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		

		int oneOrZero = (int) Math.round(randomNumber % 6);
		System.out.println(oneOrZero);
		switch (oneOrZero)
		{
		case 0: System.out.println("Heads"); break;
		case 1: System.out.println("Tails"); break;
		}
		
	}
}
