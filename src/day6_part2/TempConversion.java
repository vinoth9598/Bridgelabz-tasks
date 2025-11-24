package day6_part2;
import java.util.Scanner ;

public class TempConversion {
	public static void main(String[] args) {
		System.out.println("Enter temperature in fahenheit :");

		Scanner sc = new Scanner(System.in);
		
		int fahrenheit = sc.nextInt();
		
		convertCelsius(fahrenheit);
	}
	
	public static void convertCelsius(int f) {
		double celsius ;
		
		celsius = (f - 32) * 5/9 ;
		
		System.out.println("Temperature in Celsius :" + celsius);
	}
}
