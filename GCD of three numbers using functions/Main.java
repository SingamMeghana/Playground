import java.util.Scanner;
public class Main{
    	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int min;
		min=Math.min(num1,num2);
		min=Math.min(min,num3);
		
		for (int i=min;i>=1;i--){
		if((num1%i==0)&&(num2%i==0)&&(num3%i==0))
		{
		    System.out.print(i);
		    break;
		}
		}
}
}