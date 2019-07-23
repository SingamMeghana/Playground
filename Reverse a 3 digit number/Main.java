import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
	    int n1=in.nextInt();
	    int first_digit=n1/100;
	    int second_digit1=n1/10;
	    int second_digit=second_digit1%10;
	    int last_digit=n1%10;
	    int number = last_digit*100 + second_digit*10 + first_digit;
	    System.out.println(number);
  }
}