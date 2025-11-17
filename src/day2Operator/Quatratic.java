package day2Operator;
import java.util.Scanner ;
public class Quatratic {
	public static void main(String[] args) {
		System.out.println("Enter a values a, b, c:");
		
//		a*x*x + b*x+c
//		delta = b*b-4*a*c 
		
//		Root 1 of x = (-b + sqrt(delta))/(2*a)
//		Root 2 of x = (-b - sqrt(delta))/(2*a)
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		first delta find value 
		int delta = b*b - 4*a*c ;
		
		System.out.println(delta);
		
		if(delta < 0) {
			delta *= -1;
		}
		
		
		findRoot1(a, b, c, delta);
		findRoot2ofX(a, b, c, delta);
		
	}

	static void findRoot1(int a, int b, int c, int delta) {
		
		
		float root1Result = (float) ((-b + Math.sqrt(delta))/(2*a));
		System.out.println("root 1 of x :" + root1Result);
		
	}
	static void findRoot2ofX(int a, int b, int c,int delta) {
		float root2Result = (float) ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("root 2 of x :" + root2Result);
	}
}
