package rishiK;

import java.util.Scanner;

public class TowerofHanoi1 
{

    public static Scanner scan;

	public void solve(int n, String peg1, String peg, String peg3) 
	{
	       if (n == 1) 
	       { // if the parameter is met then it moves one disk
	           System.out.println("move disk from peg " + peg1 + " to peg " + peg3);
	       } else 
	         {// recursion 
	           solve(n - 1, peg1, peg3, peg);
	           System.out.println("move disk from peg " + peg1 + " to peg " + peg3);
	           solve(n - 1, peg, peg1, peg3);
	         }
	 }
}