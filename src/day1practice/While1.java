package day1practice;
import java.util.Scanner ;

public class While1 {
	public static void main(String[] args) {
		System.out.println("Enter sum of number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int sum = 0;
		while(i <= n) {
			sum += i;
			i++ ;
		}
		System.out.println("Sum of number :" +sum);
	}
}
