package basic;

import java.util.Scanner;

public class switch_method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter your choice");
		int c=sc.nextInt();
		System.out.println("enter your first number");
		int a=sc.nextInt();
		System.out.println("enter your second number");
		int b=sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("addition of given numbers"+(a+b));
			break;
		case 2:
			System.out.println("subtraction of given numbers"+(a-b));
			break;
		case 3:
			System.out.println("multiplication of given numbers"+(a*b));
			break;
		case 4:
			System.out.println("division of given numbers"+(a/b));
			break;
		default:
			System.out.println("invalid");
			break;
		}
		
	}

}
