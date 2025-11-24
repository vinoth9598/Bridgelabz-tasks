package day6_part2;
import java.util.Scanner;
public class DayofWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month , day and year :");
		int m =  sc.nextInt();
		int d = sc.nextInt();
		int y = sc.nextInt();
		
		int day = dayOfWeek(d, m, y);
		System.out.println("Day of Week = " + day);
	}

	private static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14-m)/12 ;
		int x = y + y / 4 - y /100 + y/ 400 ;
		int m0 = m + 12 * ((14-m)/12) - 2 ;
		int d0 = (d + x + (31 * m0)/12) % 7 ;
		return d0;
	}
}
