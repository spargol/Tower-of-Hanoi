package rishiK;

import java.util.Scanner;


public class TowerOfHanoiDriver {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		TowerofHanoi1 towerOfHanoi = new TowerofHanoi1();  // initialize towerofHanoi
		System.out.print("Enter number of discs: ");  // Ask user to enter number of discs
		scan = new Scanner(System.in);  // read user input
		int discs = scan.nextInt(); // assign users input to discs
		towerOfHanoi.solve(discs, "1", "2", "3");  // use towerofHanoi to the right procedure. 

	}
}

