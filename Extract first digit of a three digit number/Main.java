import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int last_digit=n1/10;
      int first_digit=last_digit/10;
      System.out.println(first_digit);
		// Type your code here
	}
}