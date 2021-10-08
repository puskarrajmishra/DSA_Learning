import java.util.Scanner;

public class MaximumNoDuplicates 
{
	// Returns the maximum repeated element int the array
	static int maximumNumberOfDuplicates(int arr[])
	{
		int  max_count=0;
		int count=0;
		int n=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			 count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max_count)
			{
				max_count=count;
				n=arr[i];
			}
		}
		return n;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(maximumNumberOfDuplicates(arr));
	}
}
