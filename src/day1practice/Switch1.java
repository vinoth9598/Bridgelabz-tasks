package day1practice;
import java.util.Scanner ;

public class Switch1 {
	public static void main(String[] args) {
		System.out.println("Enter a given letter");
		
		Scanner sc = new Scanner(System.in);
		
		String letter = sc.next();
		
		switch(letter) {
			case "A","E","I","O","U","a","e","i","o","u":
				System.out.println("Given Volwels");
				break;
			default :
				System.out.println("Given Consonant");
		}
		
	}
}
