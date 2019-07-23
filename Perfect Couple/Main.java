import java.util.Scanner; 
class Main { 
    static void printPairs(int arr[], int n, int sum) 
    { 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                if (arr[i] + arr[j] == sum) 
                    System.out.println( arr[i] + ", " + arr[j] ); 
    } 
    public static void main(String[] arg) 
    { 
          Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      arr[index] = sc.nextInt();
    }
        int sum = sc.nextInt(); 
        printPairs(arr, n, sum); 
    } 
}

