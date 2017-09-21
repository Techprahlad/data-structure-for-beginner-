//linear search
package git;
import java.util.*;
public class linearsearch {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter Number Of Element to be entered");
		int max=sc.nextInt();
		int[] arr=new int[max+1];
		System.out.println("Enter Element in random order");
		for(int i=0;i<max;i++)
		{
		// System.out.println("Enter Element in random order");
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter Number to be searched");
		int sr=sc.nextInt();
		
		for(int i=0;i<5;i++)
		{
			
			if(arr[i]==sr)
			{
				flag=1;				
			}
			
		}
		if(flag==0)
		{
			System.out.println("Number Not Found");
		}
		else
		{
			System.out.println("number found");
		}
}
}
