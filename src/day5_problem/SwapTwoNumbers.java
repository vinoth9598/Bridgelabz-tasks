package day5_problem;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 20;
		int b = 10 ;
		System.out.println("Before swap a: " + a );
		System.out.println("Before swap b: " + b );

		int c = b ;
		b = a;
		a = c;
		
		System.out.println("______________________________");
		System.out.println("After swap a:  " + a );
		System.out.println("After swap b: " + b);

	}
}
