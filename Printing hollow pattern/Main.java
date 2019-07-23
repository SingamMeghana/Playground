import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int rows, columns, i, j;
		sc = new Scanner(System.in);
		rows = sc.nextInt();	
		
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= rows; j++)
			{
				if(i == 1 || i == rows || j == 1 || j == rows)
				{
					System.out.print("*"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		}	
	}
}