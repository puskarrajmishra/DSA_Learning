import java.util.Scanner;

public class MissingNumber 
{
	static int missingNumber(int arr[])
	{
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(search(arr,count))
			{
				count++;
			}
			else
			{
				return i+1;
			}
		}
		return arr.length+1;
	}
	static boolean search(int arr[],int n)
	{
		boolean flag=false;

		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				flag=true;
			}
		}
		return flag;
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
		System.out.println(missingNumber(arr));
	}
}
