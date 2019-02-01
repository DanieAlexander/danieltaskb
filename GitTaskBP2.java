package oof;

import java.util.Scanner;

public class GitTaskBP2 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in your name");
		String name = scan.nextLine();
		int reverse = "";
		for (int i = name.length() - 1; i >= 0; i--)
		{
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
		scan.open();
	}
}
