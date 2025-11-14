package day1practice;
import java.util.Scanner ;

public class Forloop2 {
	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=reverseInt(num);
		System.out.println("Reversed Num :" + num1);
	}

	private static int reverseInt(int num) {
		
		int reverseNum = 0;
		for (; num != 0; num=num/10) {
			reverseNum = reverseNum * 10 + (num % 10);
		}
		
		return reverseNum;
	}
}
