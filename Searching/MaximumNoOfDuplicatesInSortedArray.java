import java.util.Arrays;
import java.util.Scanner;

public class MaximumNoOfDuplicatesInSortedArray 
{
	static int maxmNoOfDuplicatesInSortedArray(int arr[])
	{
		Arrays.sort(arr);
		int max_count=0;
		int count=0;
		int n=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else
			{
				if(max_count<count)
				{
					max_count=count;
					n=arr[i];
				}
				count=0;
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
		System.out.println(maxmNoOfDuplicatesInSortedArray(arr));
	}
}
