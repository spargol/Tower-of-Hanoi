package mollyf;
import java.util.*;
public class towerOfHanoi
{
	  public static void move(int numOfDisks, int startingPole, int endingPole) {
	    if (numOfDisks== 0){
	      return; 
	    }
	    int intermediatePole = 6 - startingPole - endingPole;
	    move(numOfDisks-1, startingPole, intermediatePole);
	    System.out.println("Move " +numOfDisks + " from " + startingPole + " to " +endingPole);
	    move(numOfDisks-1, intermediatePole, endingPole);
	  }
	  
	  public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number of disks");
		     int numOfMoves = scan.nextInt();
	    move(numOfMoves, 1, 3);
	  }
}

	  
		
		
	
	

