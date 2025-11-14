package day1practice;

import java.util.Scanner ;

public class Forloop1 {
	public static void main(String[] args) {
		System.out.println("Enter your Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sumOfNum(num);
	}

	private static void sumOfNum(int num) {
		int sum =0;
		for (int i =0; i <= num ; i++) {
			sum += i;
		}
		System.out.println("Sum of given number : "+ sum);
		
	}
}
