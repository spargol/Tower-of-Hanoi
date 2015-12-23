package patrickS;
public class Tower {

	public int move = 1;
	
	public void solve (int x, String Tower1, String Tower2, String Tower3){
		
		if (x == 1){
			 System.out.println(Tower1+" moves to "+ Tower3 +". Move number= "+ move);
			 move++;
		}
		else {
		solve (x-1, Tower1, Tower3, Tower2);
		System.out.println(Tower1 + " moves to " + Tower3 + ". Move number= "+move);
		move++;
		solve (x-1, Tower2, Tower1, Tower3);
		}
	}
}
