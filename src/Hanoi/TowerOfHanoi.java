package Hanoi;

public class TowerOfHanoi {
	static int move=0;
   public static void main(String[] args) {
      int nDisks = 3;
      doTowers(nDisks, 'A', 'B', 'C');
   }
   public static void doTowers(int topDisk, char fromPeg,
   char inter, char toPeg) {
      if (topDisk == 1){
         System.out.println("Disk 1 from "
         + fromPeg + " to " + toPeg + ":  move "+ ++move);
      }else {
         doTowers(topDisk - 1, fromPeg, toPeg, inter);
         System.out.println("Disk "
         + topDisk + " from " + fromPeg + " to " + toPeg+ ":  move "+ ++move);
         doTowers(topDisk - 1, inter, fromPeg, toPeg);
      }
   }
}