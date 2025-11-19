package day5_problem;
import java.util.Scanner ;
public class Quaotient_Remainder {
	public static void main(String[] args) {
		System.out.println("Enter value :");
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		if(n / 2 != 0) {
			System.out.println("The Quotient value is :" + n/2);
		}
		if (n % 2 == 0) {
			System.out.println("The remainder value is :" + n%2);
		}else {
			System.out.println("The remainder value is :" + n%2);
		}
	}
}
