import java.util.HashMap;
import java.util.Scanner;

public class MaximumNoOfDuplicatesByHashing 
{	
	static int maximumNumberOfDuplicatesByHashing(int arr[])
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			hm.put(arr[i],hm.get(arr[i])==null?1:hm.get(arr[i])+1);
		}
		int max_count=0;
		int n=arr[0];
		for(HashMap.Entry<Integer,Integer> map:hm.entrySet())
		{
			if(map.getValue()>max_count)
			{
				max_count=map.getValue();
				n=map.getKey();
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
		System.out.println(maximumNumberOfDuplicatesByHashing(arr));
	}
}
