package day2Operator;
import java.util.Scanner ;
public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter x and y :");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		float distance =(float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("The distance is :" + distance);
	}
}
