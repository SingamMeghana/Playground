
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int value =1;
	    for (int count =1 ; count<=n ;++count)
	    {
	        value = value * count;
	        
	    }
	    System.out.println(value);
	}
}