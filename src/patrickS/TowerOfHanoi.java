package patrickS;
import java.util.*;
public class TowerOfHanoi {
		static Scanner scan = new Scanner(System.in);
		//int "moves" will be the amount of disks on the tower
		static int moves;
		//main will show where the program will start running from. This shows
		//that this is the driver.
		public static void main(String[] args){
			//Tower is the setter class within this program
			Tower Tower = new Tower();
			//this statement will take the amount of disks which will be
			//on the tower of hanoi
			System.out.println("Number of disks on your tower: ");
			//"moves" will be equal to whatever number is typed in by the user
			moves=scan.nextInt();
			Tower.solve(moves, "Tower 1", "Tower 2", "Tower 3");
					
}}