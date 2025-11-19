package day5_problem;
import java.util.Scanner ;
public class Find_vowels {
	public static void main(String[] args) {
		System.out.println("Enter character :");
		
		Scanner sc = new Scanner(System.in);
		
		String  word = sc.nextLine();
		
		switch(word) {
			
			case "a","e","i","o","u","A","E","I","O","U":
				System.out.println("The given word is vowels");
				break;
			default:
				System.out.println("The given word is consonant");
		}
	}
}
