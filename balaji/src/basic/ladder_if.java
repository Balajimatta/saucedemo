//finding grade by using percentage
package basic;

import java.util.Scanner;

public class ladder_if {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your percentage");
			double per=sc.nextDouble();
			if(per>=90.00)
			{
				System.out.println("o grade");
			}
			else if(per<90.00 && per>=80.00)
			{
				System.out.println("a grade");
			}
			else if(per<80.00 && per>=65.00)
			{
				System.out.println("b grade");
				
			}
			else if(per<65.00 && per>=55.00)
			{
				System.out.println("c grade");
			}
			else if(per<55.00 && per>=45.00)
			{
				System.out.println("d grade");
			}
			else if(per<45.00)
			{
				System.out.println("fail");
			}
	}

}
