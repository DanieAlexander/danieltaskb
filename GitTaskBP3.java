package oof;

import java.util.Scanner;

public class GitTaskBP3 {

	public static void main(String[] args)
	{
		int lowerRange;
		boolean upperRange;
		System.out.println("Enter the smallest integer you'd like.");
		Scanner scan = new Scanner(System.in);
		lowerRange = scan.nextLine();
		System.out.println("Enter the largest integer you'd like.");
		upperRange = scan.nextInt();
		System.out.println(Math.random() * (upperRange - lowerRange) + lowerRange);
	}
}
