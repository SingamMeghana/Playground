import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int r = n % 10;
            rev = rev*10  + r;
            n = n / 10;
        }
        int re1 = rev / 10;
        int sd = re1 % 10;
        System.out.println(sd);

    }
}