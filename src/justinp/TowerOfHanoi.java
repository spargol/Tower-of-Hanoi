package justinp;

public class TowerOfHanoi {
	public int moves = 1;
	public void solve (int a, String Tower1, String Tower2, String Tower3)
	{
	if (a == 1)
	{
		System.out.println (Tower1 + " goes to " + Tower3 + " move #" + moves);
		moves++;
	}
	else
	{
		solve (a - 1, Tower1, Tower3, Tower2);
		System.out.println (Tower1 + " goes to " +Tower3 + " move #" + moves);
		moves++;
		solve (a - 1, Tower2, Tower1, Tower3);
	}
	}
}
