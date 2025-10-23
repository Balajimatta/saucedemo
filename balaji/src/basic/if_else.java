package basic;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed18");
		}
	}

}
