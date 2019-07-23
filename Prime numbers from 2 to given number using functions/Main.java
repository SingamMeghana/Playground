import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int i, number, count; 
		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
		for(number = 1; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.println(number);
		    }  
		}
	}
}