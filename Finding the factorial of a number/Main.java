import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mul = 1;
    while(n>0)
    {
      mul = mul * n ;
      n--;
    }
    System.out.print(mul);
  }
}