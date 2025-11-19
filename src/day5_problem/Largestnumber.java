package day5_problem;
import java.util.Scanner ;
public class Largestnumber {
	public static void main(String[] args) {
		System.out.println("Enter three number a, b, c :");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		Ternary operator 
		String result = (a < b) ? ((b < c) ? "C is largest number ":"b is largest number"):("a is largest number");
		System.out.println(result);
			
	}
}
