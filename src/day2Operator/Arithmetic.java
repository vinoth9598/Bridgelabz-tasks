package day2Operator;
import java.util.Scanner ;
public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Enter three numbers :");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		arithmeticProcess(a, b, c);
	}

	static void arithmeticProcess(int a, int b, int c) {
		int[] list = new int[4];
		list[0] = a+b*c ;
		
		list[1] = c+a/b ;
		
		list[2] = a%b+c ;
		
		list[3] = a*b+c ;
		
		
		int max = list[0];
		int min = list[0] ;
		
		for (int j : list) {
			System.out.println(j);
		}
		
		for (int i : list) {
			if(max < i) {
				max = i;
			}else if(min > i) {
				min = i;
			}
		}
		
		
		System.out.println("max value :" + max);
		System.out.println("min value :" + min);
		
		
	}
}
