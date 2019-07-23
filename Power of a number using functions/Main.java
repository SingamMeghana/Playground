import java.util.Scanner;
import java.lang.Math;
class Main{
public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  int base = sc.nextInt();
  int exponent = sc.nextInt();
  System.out.println(Math.pow(base, exponent));
}
}