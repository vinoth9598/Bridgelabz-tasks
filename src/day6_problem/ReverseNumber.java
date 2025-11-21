package day6_problem;
import java.util.Scanner ;
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1=reverseInt(num);
		System.out.println("Reversed Num :" + num1);
		
		int num2 = reverseWhileNum(num);
		System.out.println("Reversed Num While :"+ num2);
		int recursionReverse = 0;
		if(num < 10) {
			System.out.println(num);
			return;
		}else {
			recursionReverse = (num % 10);
			num = num/10 ;
		}
		System.out.println(recursionReverse);
	}

	private static int reverseWhileNum(int num) {
		int reverseWhileNum =0;
		
		while(num != 0) {
			reverseWhileNum = reverseWhileNum * 10 + (num%10);
			num = num/10;
		}
		
		return reverseWhileNum ;
	}

	private static int reverseInt(int num) {
		
		int reverseNum = 0;
		for (; num != 0; num=num/10) {
			reverseNum = reverseNum * 10 + (num % 10);
		}
		
		return reverseNum;
		
		
	}
}
