package lineComparison;

public class Geometry {
	public static void main(String[] args) {
		
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(7,9);
		Point1 p3 = new Point1(3, 4);
		Point1 p4 = new Point1(4,8);
		
		Line line = new Line(p1,p2);
		Line1 line1 = new Line1(p3, p4);
		
		System.out.println("Length of the line :" + line.length());
		System.out.println("Length of the line1 :" + line1.length());

//		check the line equal or not ;
		if (line.length() == line1.length()) {
			System.out.println("The two line is Equal");
		}else if (line.length() < line1.length()) {
			System.out.println("The line1 is greater than line frist");
		}else if (line.length() > line1.length()) {
			System.out.println("The line1 is less than line frist");
		}
		else {
			System.out.println("The two line is not Equal");
		}

		
	}

}


class Point{
	private double x ;
	private double y ;
	
	
	public Point(double x, double y) {
		this.x = x ;
		this.y = y ;
		
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y ;
	}

}
class Point1{
	private double m ;
	private double n ;
	
	
	public Point1(double m, double n) {
		this.m = m ;
		this.n = n ;
		
	}
	
	public double getM() {
		return m;
	}
	public double getN() {
		return n ;
	}

}

class Line {
	private Point start ;
	private Point end ;
	
	public Line (Point start, Point end) {
		this.start = start ;
		this.end = end ;
		
	}
	
	public double length() {
		double dx = end.getX() - start.getX();
		double dy = end.getY() - start.getY();
		
		return Math.sqrt((dx * dx) + (dy*dy));
		
	}
	
	
}

class Line1 {
	private Point1 first ;
	private Point1 second ;
	
	public Line1 (Point1 first, Point1 second) {
		this.first = first ;
		this.second = second ;
	}
	
	public double length() {
		double dm = second.getM() - first.getM();
		double dn = second.getN() - first.getN();
		
		return Math.sqrt((dm * dm) + (dn*dn));
	}
}