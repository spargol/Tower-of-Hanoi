package kurupd;
import java.util.Scanner;

public class TowersOfHanoi
{
  public static void main(String[] args)
  {
	  //Prints out the instructions
	  System.out.println("This program shows the steps to solve a Tower of Hanoi problem. "
	  		+ "\nDisk 1 is the smallest disk, followed by Disk 2, etc.\n"); 
	  
	  //Asks user to input the number of disks
	  System.out.println("How many disks are in this Tower of Hanoi?"); 
	  Scanner scan = new Scanner(System.in);
	  int numDisks = scan.nextInt();
	  
	  //Uses the solveHanoi method to solve the puzzle
	  solveHanoi(numDisks, "the 1st peg", "the 2nd peg", "the 3rd peg");
  }

  //Solves the puzzle by moving the "topDisk" from the "from" peg, to the "to" peg, using the "using" peg as an intermediate.
  public static void solveHanoi(int topDisk, String from, String using, String to)
  {
	  //Case to move 1 disk
	  if (topDisk == 1)
	  {
		  System.out.println("Move Disk 1 from " + from + " to " + to + ".");
	  }
	  
	  //Recursive cases
	  else
	  {
		  solveHanoi(topDisk - 1, from, to, using); //the first recursion moves topDisk-1 disks from the "from" peg to the "using" peg using the "to" peg
		  solveHanoi(topDisk - 1, using, from, to); //the second recursion moves topDisk-1 disks from the "using" peg to the "to" peg using the "from" peg
		  
		  System.out.println("Move Disk " + topDisk + " from " + from + " to " + to + "."); //prints the solution
	  }
  	}
}