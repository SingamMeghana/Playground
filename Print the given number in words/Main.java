import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n1=in.nextInt();
	if (n1<= 5 && n1>=1)
	{
	    switch(n1)
	    {
	        case 1:
	            System.out.print("One");
	            break;
	        case 2:
	            System.out.print("Two");
	            break;
	        case 3:
	            System.out.print("Three");
	            break;
	        case 4:
	            System.out.print("Four");
	            break;
	        case 5:
	            System.out.print("Five");
	            break;
	}
	}
		else
	 System.out.print("Invalid");
	}
}
