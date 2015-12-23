package BrandonS;
import java.util.*;
import BrandonS.TowersofHanoi;
public class TowerofHanoi2 {
	static Scanner scan = new Scanner(System.in);
	static int discs;
	 
	public static void main(String[] args) {
	       TowersofHanoi towersOfHanoi = new TowersofHanoi();
	       System.out.println("Enter number of discs: ");
	         discs = scan.nextInt();
	       towersOfHanoi.solve(discs, "Peg 1", "Peg 2", "Peg 3");
	   }
}
	      

