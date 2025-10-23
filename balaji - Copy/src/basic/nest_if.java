//finding eligibility of license by using  of candiadtes age 
package basic;

import java.util.Scanner;

public class nest_if {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age<60)
		{
			if(age>18)
			{
				System.out.println("eligible for license");
			}
			else
			{
				System.out.println("minor");
			}
		}
		else
		{
			System.out.println("not eligible for license");
			
		}
	}

}
