import java.util.Scanner;

class StarsSecond
{
	public static void main(String [] args)
	{
		int rowLength = 5;
		int stars = 10;
		int space = 0;
		
		
		for (int columns = 0; columns < rowLength; columns++)
		{
			for (int k = 0; k < space; k++)
			{
				System.out.print(" ");
			}
			
			
			for(int row = 0; row < stars; row++)
			{
				System.out.print("*");
				
			}
		System.out.println();
		stars -= 2;
		space += 1;
		}
	
		int secondRowLength = 5;
		int secondStars = 2;
		int secondSpace = 5;
		
		for (int columnsTwo = 0; columnsTwo < secondRowLength; columnsTwo++)
		{
			for (int a = 5; a > secondSpace; a--)
			{
			System.out.print(" ");
			}
			
			for (int rowTwo = 10; rowTwo > stars; rowTwo--)
			{
			System.out.print("*");
			}
		System.out.println();
		secondStars += 2;
		secondSpace -= 1;
		}
		
	}
}