import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int last_digit = n1/10;
      int second_digit = last_digit%10;
      System.out.println(second_digit);
	}
}