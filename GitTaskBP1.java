package oof;

import java.util.Scanner;

public class GitTaskBP1{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.in.println("Please type in an Integer");
		int first = Integer.parseInt(scan.nextLine());
		String second = Integer.parseInt(scan.nextLine());
		System.out.println( (first + second) / 2);
		scan.close();
	}
}
