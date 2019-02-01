package oof;

import java.util.Scanner;

public class GitTaskBP1{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in two Integers.");           //System.out.println is the correct command
		int first = Integer.parseInt(scan.nextLine());
		int second = Integer.parseInt(scan.nextLine());            // Integer.parseInt requires an int variable type
		System.out.println( (first + second) / 2);
		scan.close();
	}
}
