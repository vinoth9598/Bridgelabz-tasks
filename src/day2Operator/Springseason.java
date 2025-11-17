package day2Operator;
import java.util.Scanner ;
public class Springseason {
	public static void main(String[] args) {
		System.out.println("Enter month :");
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		System.out.println("Enter day :");
		int d = sc.nextInt();
		
		checkMonthandDate(m , d);
		
	}

	static void checkMonthandDate(int m, int d) {
		
		if((m >= 3 && d>=20)&&(m <= 6 && d <= 20)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
