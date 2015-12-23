package stevend;
import java.util.*; //imports the scanner
public class TowerSolve {
	
	static Scanner scan = new Scanner(System.in); //creates a scanner
	static int discs; //creates the int for discs used by the scanner
	
	
	public static void main(String[] args) {
		
		TowerOfHanoi TowerOfHanoi = new TowerOfHanoi(); //creates the setter class
		System.out.println("Number of discs: "); //asks user how many discs they want
		discs = scan.nextInt(); //reads the user input
		TowerOfHanoi.solve(discs, "Tower 1", "Tower 2", "Tower 3"); //makes code work

	}
}
