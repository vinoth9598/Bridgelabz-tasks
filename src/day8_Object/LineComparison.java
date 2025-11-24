package day8_Object;
import java.util.Scanner ;
public class LineComparison {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter line1 coordinates (x1 y1 x2 y2) :");
		
		Line line1 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println("Enter line2 coordinates (x1, y1, x2, y2) :");
		Line line2 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		double length1 = line1.length();
		double length2 = line2.length();
		
		System.out.println("Length of Line 1 :" + length1);
		System.out.println("Length of Line 2 :" + length2);
		
		if(line1.equals(line2)) {
			System.out.println("Two lines are Equal length");
		}else {
			System.out.println("Two lines are not Equal length");
		}
	}
}


