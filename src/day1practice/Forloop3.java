package day1practice;
import java.util.Scanner ;

public class Forloop3 {
	public static void main(String[] args) {
		System.out.println("Enter check Number :");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int palinNum = checkPalin(number);
		
		if (number == palinNum) {
			System.out.println("Given is Palindrome");
		}else {
			System.out.println("Given is not palindrome");
		}
	}

	private static int checkPalin(int n) {
		
		System.out.println("Before palindrome number :" + n);
		int reversedNum = 0;
		
		for (; n != 0; n = n/10) {
			reversedNum = reversedNum * 10 + (n % 10);
		}
		System.out.println("After palindrome number or reverse :"+ reversedNum);

		return reversedNum ;
	}
}
