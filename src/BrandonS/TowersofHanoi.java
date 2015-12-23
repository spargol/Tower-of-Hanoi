package BrandonS;

public class TowersofHanoi {
	 public int move=1;
	 public void solve(int n, String peg1, String peg2, String peg3) {
		 	if (n == 1) {
	           System.out.println(peg1 + " to " + peg3 + " move " + move);
	           move++;
	       } else {
	           solve(n - 1, peg1, peg3, peg2);
	           System.out.println(peg1 + " to " + peg3 + " move " + move);
	           ++move;
	           solve(n - 1, peg2, peg1, peg3);
	           }
	        }
	}


