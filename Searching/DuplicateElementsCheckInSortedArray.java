import java.util.Scanner;

public class DuplicateElementsCheckInSortedArray 
{
	static boolean duplicateElementsCheckInSortedArray(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
				return true;
		}
		return false;
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
		System.out.println(duplicateElementsCheckInSortedArray(arr));
	}
}
