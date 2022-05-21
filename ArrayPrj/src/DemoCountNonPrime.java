import java.util.Scanner;

public class DemoCountNonPrime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
       
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>1)
			{
				for(int j=2;j<=arr[i]/2;j++)
				{
					if(arr[i]%2==0)
						count++;
				}
			}
		}
		System.out.println("No. of non-prime elements="+count);
	}	
}
