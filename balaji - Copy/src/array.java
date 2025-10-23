import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		
		int b;
		int l=0;
		int z=2147483647;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
				b=sc.nextInt();
				arr[i]=b;
				
		}
		System.out.println(Arrays.toString(arr));
		int j=0;		
		for(int k=0;k<size;k++)
		{
			
			for(j=k+1;j<size;j++)
			{
				
				//System.out.println(arr[k]+" "+arr[j]);
			    if(arr[k]!=arr[j])
				{
					if(arr[k]>arr[j])
					{   
						if(arr[k]>l)
						{
						l=arr[k];
						
						
						//System.out.println(l);
						}
						
					}
					
					else if(arr[j]>arr[k])
					{
						
						if(arr[k]<z)
						{
							z=arr[k];
							
							//System.out.println(z);
						
						}
						
						
					}
					
					
					
				}
				
				
			}
			
			
		}
		if(arr[size-1]>l)
		{
			System.out.println("maximum value in ARRAY is "+arr[size-1]);
			System.out.println("minimum value in ARRAY is "+z);
		}
		else  if(arr[size-1]<z)
		{
			System.out.println("maximum value in ARRAY is "+l);
			System.out.println("minimum value in ARRAY is "+arr[size-1]);
		}


	


}

}
 