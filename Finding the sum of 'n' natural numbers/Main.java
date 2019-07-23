import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int value = n*(n+1);
        int sum = value/2;
        System.out.print(sum);
    }
}