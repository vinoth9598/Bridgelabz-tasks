package snakeproblem;

import java.util.* ;

public class SnakeLadder {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Snakes (key = head, value = tail)
	        Map<Integer, Integer> snakes = new HashMap<>();
	        snakes.put(99, 54);
	        snakes.put(70, 55);
	        snakes.put(52, 42);
	        snakes.put(25, 2);

	        // Ladders (key = bottom, value = top)
	        Map<Integer, Integer> ladders = new HashMap<>();
	        ladders.put(6, 25);
	        ladders.put(11, 40);
	        ladders.put(60, 89);
	        ladders.put(46, 90);

	        int position = 1;
	        Random rand = new Random();

	        System.out.println(" Welcome to Snake & Ladder!");
	        System.out.println("Press ENTER to roll the dice...");

	        while (position < 100) {
	            sc.nextLine(); // Wait for user input

	            int dice = rand.nextInt(6) + 1;
	            System.out.println("You rolled: " + dice);

	            if (position + dice <= 100) {
	                position += dice;
	            }

	            System.out.println("Moved to: " + position);

	            // Snake check
	            if (snakes.containsKey(position)) {
	                System.out.println(" Oh no! Snake bite!");
	                position = snakes.get(position);
	                System.out.println("Moved down to: " + position);
	            }

	            // Ladder check
	            if (ladders.containsKey(position)) {
	                System.out.println(" Yay! You got a ladder!");
	                position = ladders.get(position);
	                System.out.println("Climbed up to: " + position);
	            }

	            System.out.println("----------------------------------");
	        }

	        System.out.println(" Congratulations! You reached 100!");
	    }
	
}
