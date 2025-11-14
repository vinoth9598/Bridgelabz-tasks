package day1practice;
import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		System.out.println("Enter your number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverseInt(num);
		
	}

	private static void reverseInt(int num) {
		// TODO Auto-generated method stub
		int reverseNum = 0;
		while(num != 0) {
			reverseNum = reverseNum * 10 + (num % 10)   ;
			
			num = num /10 ;
		}
		System.out.println("reverse completed : " + reverseNum);
		
		
	}

}
