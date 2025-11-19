package day5_problem;

import java.util.Scanner ;

import java.util.Random ;

public class Flipcoin {
 public static void main(String[] args) {
	 Random random = new Random();
	 
	 Scanner sc = new Scanner(System.in);
	 
	 String[] flips = {"head", "tail"};
	 
	 int head = 0;
	 int tail = 0;
	 
	 System.out.println("Enter how many times flip coins");
	 int n = sc.nextInt();
	 
	 for (int i = 0; i < n; i++) {
		 String flip = flips[random.nextInt(2)];
		 if(flip == "head") {
			 head++ ;
		 }else {
			 tail++ ;
		 }
	 }
	 
	 float headsPercent = (float) ((head * 100)/n);
	 float tailsPercent = (float) ((tail * 100)/n);
	 
	 System.out.println("Heads count :" + head);
	 System.out.println("Tail count :"+ tail);
	 System.out.println("Percentage of count :" +String.format("%.2f",headsPercent) + "%" );
	 System.out.println("Percentage of tail :" +String.format("%.2f", tailsPercent) + "%" );

	 
	 
 }
}
