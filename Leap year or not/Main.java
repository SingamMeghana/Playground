import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int year=in.nextInt();
	if (year % 4 == 0){
	    if (year % 100 ==0 )
	    {
	        if (year % 400 ==0 )
	        System.out.print("Leap year");
	        else
	        System.out.print("Non Leap year");
	        
	    }
	    else
	    System.out.print("Leap year");
	}
	else
	    System.out.print("Non Leap year");

	}
}
