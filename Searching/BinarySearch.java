import java.util.Scanner;

public class BinarySearch 
{	
	static int binarySearch(int arr[],int n,int low,int high)
	{


		if(low>high)
		{
			return -1;
		}
		else
		{
			int mid = (low+high)/2;
			if(arr[mid]==n)
			{
				return mid ; 
			}
			else if(arr[mid]<n)
			{
				return binarySearch(arr,n,mid+1,high);
			}
			else
			{
				return binarySearch(arr,n,low,mid-1);
			}
		}

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
		System.out.println("Enter the Searching Number");
		int s=sc.nextInt();
		sc.close();
		int result=binarySearch(arr,s,0,arr.length);
		System.out.println(result);
	}
}
