import java.util.Scanner;

public class DuplicateElementsCheckInArray 
{
	static boolean checkDuplicateBruteForce(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count+=1;
			}
			if(count>1)
			{
				return true;
			}
			
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
		System.out.println(checkDuplicateBruteForce(arr));
		
	}
}
