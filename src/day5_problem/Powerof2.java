package day5_problem;
import java.util.Scanner; 
public class Powerof2 {
	public static void main(String[] args) {
		if(args.length ==0) {
			System.out.println("Please provide a valur for N");
			
		}
		System.out.println("Enter N value :");
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt();
		if(((0 <= N) && (N < 31))) {
			
			int power = 1 ;
			
			for (int i=0; i  <= N ; i++) {
				System.out.println("2^" + i + "=" + power);
				power *= 2 ;
			}
		}else {
			System.out.println("N must be between o and 30");
		}
		
		
	}
}
