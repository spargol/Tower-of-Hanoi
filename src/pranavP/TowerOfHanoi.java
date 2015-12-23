package pranavP;

import java.util.Scanner;

/**
 * Created by pranavprabhala on 1/5/15.
 */
public class TowerOfHanoi {


    static int numMoves = 1;

    public static void main(String[] args) {

        //Takes the number of discs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of layers: ");
        int discs = scanner.nextInt();

        //The solveTower method is recursive, so it will keep running itself until solved
        solveTower(discs, "Left", "Middle", "Right");
    }



        public static void solveTower(int num, String start, String middle, String end) {


            if (num == 1) {
                //Moves the first peice to the destination space
                System.out.println("Move " + numMoves +  ": From " + start + " to " + end);
                numMoves++;
            } else {
                //move to the middle
                solveTower(num - 1, start, end, middle);
                System.out.println("Move " + numMoves + ": From " + start + " to " + end);
                numMoves++;
                //move the piece in the middle to the end
                solveTower(num - 1, middle, start, end);
            }
        }



    }

