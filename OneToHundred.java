import java.util.Scanner;

class OneToHundred
{
	public static void main(String [] args)
	{
		int columns;
		int rows;
		int number = 1;
		
		
		for (columns = 1; columns <= 10; columns++)
		{
			for(rows = 1; rows <= 10; rows++)
			{
				System.out.print(number + " ");
				number++;
			}
		System.out.println();
		}
	}
}