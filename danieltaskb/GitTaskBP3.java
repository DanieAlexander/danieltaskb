package oof;

import java.util.Scanner;

public class GitTaskBP3 {

	public static void main(String[] args)
	{
		int lowerRange;
		int upperRange;                                                                     //lowerRange should be an int not a boolean
		System.out.println("Enter the smallest integer you'd like.");
		Scanner scan = new Scanner(System.in);
		lowerRange = scan.nextInt();                                                       //you would need scan.nextInt() to get the int coming in
		System.out.println("Enter the largest integer you'd like.");
		upperRange = scan.nextInt();
		System.out.println(Math.random() * (upperRange - lowerRange) + lowerRange);
		scan.close();
	}
}
