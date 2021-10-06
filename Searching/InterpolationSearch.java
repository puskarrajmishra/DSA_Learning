import java.util.Scanner;

public class InterpolationSearch 
{
	static int interpolationSearch(int arr[],int n,int low,int high)
	{


		if(low>high)
		{
			return -1;
		}
		else
		{
			
			// Since array is sorted, an element present in array must be in range defined by corner
			if(arr[low]<=n && arr[high]>=n)
			{
				int mid = low+((n-arr[low])/(arr[high]-arr[low])*(high-low));
				
				if(arr[mid]==n)
				{
					return mid ; 
				}
				else if(arr[mid]<n)
				{
					return interpolationSearch(arr,n,mid+1,high);
				}
				else
				{
					return interpolationSearch(arr,n,low,mid-1);
				}
			}
			else
				return -1;
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
		int result=interpolationSearch(arr,s,0,arr.length-1);
		System.out.println(result);
	}
}
