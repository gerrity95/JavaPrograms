import java.util.Scanner; 

class MilestoneProgram
{
	public static void main(String [] args)
	{
		
		//List of all the Items for sale in variables
		double anyScrews = 2.50;
		double sandpaper = 0.55;
		double lampshade = 30;
		double smallFrame = 7.99;
		double paintBrush = 6.95;
		double largePaint = 34.50;
		double smallPaint = 9.95;
		double gardenPot = 10;
		double plants = 7;
		
		//Amount of times each item is bought
		
		int amountScrews = 0;
		int amountSandpaper = 0;
		int amountLampshade = 0;
		int amountSmallFrame = 0;
		int amountPaintBrush = 0;
		int amountLargePaint = 0;
		int amountSmallPaint = 0;
		int amountGardenPot = 0;
		int amountPlants = 0;
		

		/*
		ask the user how many of each item they want to buy
		Scanner which gets the amount
		move the totalVariables down to here 
		if/else statement to get general reduction
		then take away amount for the specials above
		Print out the prices
		
		*/
		
		System.out.println("Welcome to our shop!");
		System.out.println();
		System.out.println("Would you like to purchase anything (yes/no)?");
		
		Scanner sc = new Scanner(System.in);
		String purchaseAnything;
		purchaseAnything = sc.nextLine();
		
		while( purchaseAnything.equalsIgnoreCase("yes"))
		{
		System.out.println();
		System.out.println("This is what we have for sale:");
		System.out.println("Boxes of screws (any size): E 2.50");
		System.out.println("Sandpaper: E 0.55");
		System.out.println("Lampshade: E 30");
		System.out.println("Small Picture Frame: E 7.99");
		System.out.println("Paint Brush: E 6.95");
		System.out.println("Large Tin of Paint: E 34.50");
		System.out.println("Small Tin of Paint: E 9.95");
		System.out.println("Ceramic Garden Pot: E 10");
		System.out.println("All Plants: E 7");
		System.out.println();
		System.out.println("The specials today are: ");
		System.out.println("All paint related products are half price");
		System.out.println("All gardening products are 25% off");
		System.out.println("Purchases up to E 50 are 5% off");
		System.out.println("Purchases between E50 & E100 are 7.5% off");
		System.out.println("Purchases between E100 & E250 are 10% off");
		System.out.println("Purchases over E250 are 15% off");
		System.out.println();
		System.out.println();
		System.out.println("How many boxes of screws would you like to buy?");
		amountScrews = sc.nextInt();
		System.out.println("How much sandpaper would you like to buy?");
		amountSandpaper = sc.nextInt();
		System.out.println("How many lampshades would you like to buy?");
		amountLampshade = sc.nextInt();
		System.out.println("How many small picture frames would you like to buy?");
		amountSmallFrame = sc.nextInt();
		System.out.println("How many paint brushes would you like to buy?");
		amountPaintBrush = sc.nextInt();
		System.out.println("How many large tins of paint would you like to buy?");
		amountLargePaint = sc.nextInt();
		System.out.println("How many small tins of paint would you like to buy?");
		amountSmallPaint = sc.nextInt();
		System.out.println("How many ceramic garden pots would you like to buy?");
		amountGardenPot = sc.nextInt();
		System.out.println("How many plants would you like to buy?");
		amountPlants = sc.nextInt();

		// this is the total cost of each item if its bought;
		double totalScrews = anyScrews * amountScrews;
		double totalSandpaper = sandpaper * amountSandpaper;
		double totalLampshade = lampshade * amountLampshade;
		double totalSmallFrame = smallFrame * amountSmallFrame;
		double totalPaintBrush = paintBrush * amountPaintBrush;
		double totalLargePaint = largePaint * amountLargePaint;
		double totalSmallPaint = smallPaint * amountSmallPaint;
		double totalGardenPot = gardenPot * amountGardenPot;
		double totalPlants = plants * amountPlants;
		
		
		//This is going to add up the amount before the specials
		
		double originalAmount = totalScrews + totalSandpaper + totalLampshade + totalSmallFrame + totalPaintBrush + totalLargePaint + totalSmallPaint
		+ totalGardenPot + totalPlants;
		
			if (originalAmount <= 50)
			{
				originalAmount = originalAmount * 0.95;
			}
			else if ( (originalAmount > 50) && (originalAmount <= 100) )
			{
				originalAmount = originalAmount * 0.925;
			}
			else if ( (originalAmount > 100) && (originalAmount <= 250) )
			{
				originalAmount = originalAmount * 0.9;
			}
			else
			{
				originalAmount = originalAmount * 0.85;
			}
		
		//This is the reductions due to the paint special
		
		double paintReductions = (totalPaintBrush + totalLargePaint + totalSmallPaint) * 0.5;
		
		//This is the reductions due to the gardening special
		
		double gardenReductions = (totalGardenPot + totalPlants) * 0.75;
		
		double totalAmount = originalAmount - paintReductions - gardenReductions;
		
		System.out.println("Your total will come to: E" + totalAmount);
		
		System.out.println();
		}
		
		System.out.println("Thank you, hope to see you again!");
	}
}