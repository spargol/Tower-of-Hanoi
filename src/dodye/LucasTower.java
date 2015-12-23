package dodye;

import java.util.Scanner;

public class LucasTower {

	 public static void main(String[] args) {
	       HanoiClass lucasTower = new HanoiClass();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       lucasTower.solve(discs, "A", "B", "C");
	   }
	}

