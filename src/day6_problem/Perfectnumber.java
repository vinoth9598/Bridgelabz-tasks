package day6_problem;
import java.util.Scanner ;
public class Perfectnumber {
	public static void main(String[] args) {
		System.out.println("Enter check number :");
		Scanner sc = new Scanner(System.in);
		int checkNumber = sc.nextInt() ;
		int divideNumberSum =0; 
		for(int i =1; i<checkNumber; i++) {
			if(checkNumber % i == 0) {
				System.out.println(i);
				divideNumberSum += i;
			}
		}
//		System.out.println(divideNumberSum);
		
		if(checkNumber == divideNumberSum) {
			System.out.println("The given number is perfect number");
		}else {
			System.out.println("The given number is not perfect number");
		}
	}
}
