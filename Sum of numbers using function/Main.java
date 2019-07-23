import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int sum = ( n1*(n1+1) ) / 2;
      System.out.println(sum);
	}
}