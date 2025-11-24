package day6_part2;
import java.util.Scanner ;

public class ToBinary {
	public static void main(String[] args) {
		System.out.println("Enter a Binary convert number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = toBinary(num);
		
		System.out.println("binary is :" + result);
	}

	private static String toBinary(int num) {
		
		StringBuilder binary = new StringBuilder();
		
		while (num > 0) {
			int remainder = num % 2 ;
			binary.append(remainder);
			num = num/2 ;
		}
		
		binary.reverse();
		return binary.toString();
	}
}
