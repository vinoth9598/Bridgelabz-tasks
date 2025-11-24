package day6_part2;
import java.util.Scanner ;
public class VendingMachine {
	static int[] notes = {1000, 500, 100, 50, 5, 2, 1};
	static int totalNotes = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount :");
		int amount = sc.nextInt();
		
		calculateNotes(amount);
		System.out.println("Total Minimum Notes Required = "+ totalNotes);
	}

	public static void calculateNotes(int amount) {
		if(amount == 0) {
			return ;
		}
		
		for (int i=0; i <notes.length; i++) {
			if (amount >= notes[i]) {
				int noteCount = amount/notes[i];
				totalNotes += noteCount ;
				System.out.println(notes[i] + "Rs notes :" +noteCount);
				calculateNotes(amount%notes[i]);
				break ;
			}
		}
		
	}
}
