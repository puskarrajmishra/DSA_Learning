import java.util.Scanner;

public class FirstRepeatingNumber
{
	static int firstReapeatingBruteForce(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>1)
			{
				return arr[i];
			}
			
		}
		return -1;
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
		System.out.println(firstReapeatingBruteForce(arr));
	}

}
