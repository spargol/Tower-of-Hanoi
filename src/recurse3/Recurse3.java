package recurse3;
import java.util.*;

public class Recurse3
{
	static int moves=0;
   public static void main (String[] args)
   {
	 int n = 4;
 
	 String StepsToSolution;
 
	 System.out.println("The total number of moves for "+n+" disks is "
			 			+(Math.pow(2, n)-1));
	 
	 StepsToSolution = hanoi(n, 1, 3);
 
	 System.out.println(StepsToSolution);
   }

   public static String hanoi(int nDisks, int fromPeg, int toPeg)
   {
	 int helpPeg;
	 String Sol1, Sol2, MyStep, mySol;   // Contains moves
	 
	 if ( nDisks == 1 )
	 {
	    return fromPeg + " -> " + toPeg +" move "+ ++moves+"\n";
	 }
	 else
	  {
	    helpPeg = 6 - fromPeg - toPeg;    // Because fromPeg + helpPeg + toPeg = 6    

	    Sol1 = hanoi(nDisks-1, fromPeg, helpPeg);    
                                                      
	    MyStep = fromPeg + " -> " + toPeg +" move "+ ++moves+"\n";    
                                              
	    Sol2 = hanoi(nDisks-1, helpPeg, toPeg);      

	    mySol = Sol1 + MyStep + Sol2 ;     // + = String concatenation !
	  
	    return mySol;
	  }
   }

}