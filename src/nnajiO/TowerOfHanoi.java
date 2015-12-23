package nnajiO;

import java.util.Scanner;

public class TowerOfHanoi {
	static Scanner scanner = new Scanner(System.in);
	
	  //the objective is to get all the discs from pole 1 (start) to the third pole (end) while using the 2nd pole 
	  //(middlepole) as well for support
	   public void solve(int disc, String start, String middlePole, String end) 
	   {
		   if(disc != 1) 
		   { 
			   solve(disc - 1, start, end, middlePole);
			   System.out.println(start + " to " + end);
			   solve(disc - 1, middlePole, start, end);
	       }
		   else
		   {
	           System.out.println(start + " to " + end);
	       }
       }
	   
	   //this method is just for the user so that they can enter the number of discs they want
	   public static void main(String[] args) 
	   {
		   int moves;
		   
	       TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
	       
	       int numOfDiscs;
	       
	       System.out.print("Enter number of discs: ");
	       numOfDiscs = scanner.nextInt();

	       towerOfHanoi.solve(numOfDiscs, "A", "B", "C");//A="start", B="middlePole", C="end"
	       
	       //the equation (2^n)-1 is the equation for the minimum number of moves needed in tower of
	       //Hanoi ("n" being the # of discs).
	       moves=((int) Math.pow(2.0, numOfDiscs)) - 1;
	       System.out.print("The minumum number of moves necessary are: " + moves);
	   }
}