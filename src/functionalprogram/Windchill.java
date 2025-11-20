package functionalprogram;
import java.util.Scanner ;
public class Windchill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature (t) :");
		double t = sc.nextDouble();
		
		System.out.println("Enter wind speed (v):");
		double v = sc.nextDouble();
		
		if((t < 50)&&(v > 3 || v < 120) ){
			double windChill = 35.74 + 
					0.6215 * t + (0.4275 * t - 35.75) 
					* Math.pow(v, 0.16);
			
			System.out.println("Wind chill = "+ windChill);

			
		}else {
			System.out.println("The t value is lessthan 50 ");
			System.out.println("The v value is greater than 3 and less than 120");
		}
		
	}
}
