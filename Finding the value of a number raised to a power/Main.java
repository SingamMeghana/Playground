import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        int value1=1;
        while(exponent!=0)
        {
        value1 = value1*base;
        exponent--;
        }
        System.out.println(value1);
    }
}
