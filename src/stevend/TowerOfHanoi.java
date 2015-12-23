package stevend;

public class TowerOfHanoi {
	
public int move=1; //initiates move to get a counter of how many moves are made

public void solve(int x, String Tower1, String Tower2, String Tower3){
	//above sets up solve to be used later using an int and 3 strings for each tower
	
	if (x == 1){ //this if for when it's at 1 and just moves it from far left to far right
		System.out.println(Tower1 + " goes to " + Tower3 + " move #" + move);
		//above is the print telling the user what is happening when x = 1
		move++; //increases move so that you can keep a tally of the moves taken
	} 
	
	else {
		solve(x - 1, Tower1, Tower3, Tower2);  //uses the solve created earlier
		System.out.println(Tower1 + " goes to " + Tower3 + " move #" + move);
		//above is the println telling the user what is happening as the pc runs the program
		move++; //increases move so that you can keep a tally of the moves taken
		solve(x - 1, Tower2, Tower1, Tower3); //uses the solve created earlier

	}
	}
}