package dilpreets;

import java.util.Scanner;

public class Solve {
	static Scanner scan =new Scanner(System.in);
	static int discs;
	
	public static void main (String[] args)
	{
		TowerOfHanoi TowerOfHanoi =new TowerOfHanoi();
		System.out.println("Number of discs: ");
		discs = scan.nextInt();
		TowerOfHanoi.solve(discs, "Tower1", "Tower2", "Tower3");
	}
}
