package day5_problem;
import java.util.Scanner ;
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter your N value :");
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int m = 1;
		
		if(N != 0) {
			double sum =0; 
			for (double i=1; i<=N;i++) {
				
//				System.out.print(m +"/"+i );
//				
//				if(i!= N) System.out.print(" + ");
				
				sum += m/i ;
			
			}
			System.out.println("sum of N series: " +sum);
		}else {
			System.out.println("The given value must be greater than zero ");
		}
	}
}
