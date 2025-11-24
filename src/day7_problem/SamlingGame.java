package day7_problem;
import java.util.Scanner ;
public class SamlingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Stake Amount:");
		int stake = sc.nextInt();
		
		System.out.println("Enter Goal Amount :");
		int goal = sc.nextInt();
		
		System.out.println("Enter Number of Trails :");
		int trials = sc.nextInt();

		int wins = 0;
		
		for(int i =0; i<trials; i++) {
			int cash = stake ;
			
			while (cash > 0 && cash < goal) {
				if(Math.random() < 0.5) {
					cash++ ;
				}else {
					cash--;
				}
			}
			
			if (cash == goal) {
				wins++ ;
			}
		}
		
		int losses = trials - wins ;
		
		double winPercentage = (wins * 100.0)/trials ;
		double lossPercentage = (losses * 100.0)/trials ;
		
	     System.out.println("Total Trials: " + trials);
	     System.out.println("Wins: " + wins);
	     System.out.println("Losses: " + losses);
	     System.out.println("Win Percentage: " + winPercentage + "%");
	     System.out.println("Loss Percentage: " + lossPercentage + "%");
		
	}
}
