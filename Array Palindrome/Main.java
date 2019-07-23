import java.util.Scanner;
class Main { 

	static void palindrome(int arr[], int n) 
	{ 
		int flag = 0; 
		for (int i = 0; i <= n / 2 && n != 0; i++) { 
			if (arr[i] != arr[n - i - 1]) { 
				flag = 1; 
				break; 
			} 
		} 
		if (flag == 1) 
			System.out.println("No"); 
		else
			System.out.println("Yes"); 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	    int arr_size=sc.nextInt();
	    int arr[]=new int[arr_size];
	    for (int index=0;index<arr_size;index++)
	    {
	        arr[index]=sc.nextInt();
	    }
		int n = arr.length; 
		palindrome(arr, n); 
	} 
} 
