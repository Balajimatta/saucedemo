//finding given number is odd or even number
package basic;

import java.util.Scanner;

public class even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int a=sc.nextInt();
		if(a%2==0)
		
		{
			System.out.println("even");
		}
		else
			System.out.println("odd");
	}

}
