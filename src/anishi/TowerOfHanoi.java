/* Hey Ms.Spargo! Here is the Tower of Hanoi project. I thought this was a really cool
 * assignment. I would just like to acknowledge that I followed an Emory tutorial and the Vogella Tutorial on how to create this program.
 * Thanks! It was nice having you as teacher for a semester! If you have any questions about the program, you can ask me.
 */
package anishi;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void hanoi (int disks, int firstPeg, int endPeg) 
	{
		int helpPeg;
		String Sol1, Sol2, MyStep, mySol;
		
		if (disks == 0) //if one disk, returns empty
		{
			return;
		}
		else
		{
			helpPeg = 6-firstPeg-endPeg; // gives for value middle
			
			hanoi(disks-1, firstPeg, helpPeg); //getting half-way through
			
			System.out.println(" Move " + disks + " from " + firstPeg + " to " + endPeg); // moves largest peg to toPeg
			
			hanoi(disks-1, helpPeg, endPeg);
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of disks: "); // retrieves number of moves
		int disks = scan.nextInt();
		int numsteps = (int) (Math.pow(2, disks)-1);
		
		System.out.println("Number of moves to complete the problem: " + numsteps);
		
		hanoi(disks, 1, 3);
		
	}

}
