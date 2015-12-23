package ericn2;

import java.util.*;

public class Sovle {

	static Scanner hi = new Scanner (System.in);
	static int disc;
	
	public static void main(String[]args){
		
		TowerOfHanoi Tower = new TowerOfHanoi ();
		System.out.println("Enter number of discs: ");
		disc=hi.nextInt();
		Tower.Solve(disc, "Tower 1", "Tower 2", "Tower 3");
	}
}
