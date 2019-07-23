import java.util.Scanner;
public class Main {
    
   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String new_str = str.replaceAll(str1,str2);
        System.out.println(new_str);
    }
}