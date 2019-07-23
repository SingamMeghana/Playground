import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int count = 1; count <= 2*n-1 ;count = count +1)
        {
            if (count % 2 ==1)
            System.out.println(count);
        }

    }
}