import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String original=sc.nextLine();
	    int length=original.length();
	    String reverse = "";
	    for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("Yes");
      else
         System.out.println("No");
	    
	}
}
