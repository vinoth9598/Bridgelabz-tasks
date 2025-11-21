package day6_problem;
import java.util.Scanner ;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter given number :");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		fibonacciNumber(n);
	}

	private static void fibonacciNumber(int n) {
		
		int n1 =0, n2 = 1 ;
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			int n3 = n2 + n1 ;
			arr[i] = n1;
			n1 = n2 ;
			n2 = n3;
		
		}
		System.out.println();
	
		for(int m1:arr)System.out.print( m1 + " ");
		
	}
}
