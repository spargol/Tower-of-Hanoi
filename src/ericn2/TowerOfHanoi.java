package ericn2;

public class TowerOfHanoi {


		public int move=1;
		
		public void Solve (int x, String Tower1, String Tower2, String Tower3){
			if (x==1){ //Checks to see if the disc is the last one
				System.out.println("Move #"+move+": "+Tower1+" moves to "+Tower3);
				move++;
			}
			else{ //Moves the discs recursively in between all the towers to get
				Solve(x-1, Tower1, Tower3, Tower2); //the largest disc on Tower 3.
				System.out.println("Move #"+move+": "+Tower1+" moves to "+Tower3);
				move++;
				Solve(x-1, Tower2, Tower1, Tower3);
			}
		}
	

}
