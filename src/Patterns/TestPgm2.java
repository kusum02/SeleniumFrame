package Patterns;

import java.util.Scanner;

public class TestPgm2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pattern");
		String inp= sc.nextLine();
		
		String str="test yantra test software solutions";
		
		String [] str1=str.split(" ");
		
		for(String s:str1)
		{
			if(s.contains(inp))
				System.out.println(s);
		}
		sc.close();
	}

}
