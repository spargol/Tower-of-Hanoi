package dodye;

public class HanoiClass {
	public static int move = 0;
	 public void solve(int x, String Peg1, String Peg2, String Peg3) {
		   int disc = x;
	       if (x == 1) {
	    	   move++;
	    	   disc = 1;
	           System.out.println("Move #"+ move + ": " + "Disk# " + disc + " from " + Peg1 + " -> " + Peg3);
	       } else {
	           solve(x - 1, Peg1, Peg3, Peg2);
	           move++;
	           System.out.println("Move #"+ move + ": " + "Disk# " + disc + " from " + Peg1 + " -> " + Peg3);
	           solve(x - 1, Peg2, Peg1, Peg3);
	       } 
	 }
}
