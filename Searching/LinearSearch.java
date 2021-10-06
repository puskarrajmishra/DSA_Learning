import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Searching Number");
		int s=sc.nextInt();
		sc.close();
		boolean flag=false;
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(s==arr[i])
			{
				flag=true;
				index=i;
			}
		}
		index+=1;
		if(flag)
		{
			System.out.println("index for number is : "+index);
		}
		else
		{
			System.out.println("Number Not Found..!");
		}
		
	}
}
