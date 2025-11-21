package day6_problem ;
import java.util.Scanner ;
public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int n = sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println("The given value prime");
		}else {
			System.out.println("The given value not prime");
		}
	}

	static boolean isPrime(int n) {
		if(n <=1)
			return false ;
		
		for(int i =2; i< n ;i++) {
			if(n % i == 0) {
				return false ;
			}
			return true ;
		}
		return false;
	}
}
