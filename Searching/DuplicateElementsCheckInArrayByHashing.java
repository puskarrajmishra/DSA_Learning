import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElementsCheckInArrayByHashing 
{
	static boolean duplicateElementsCheckInArrayByHashing(int arr[])
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			hm.put(arr[i],hm.get(arr[i])==null?1:hm.get(arr[i])+1);
		}
		System.out.println(hm);
		for(HashMap.Entry<Integer,Integer> m:hm.entrySet())
		{
			if(m.getValue()>1)
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
		System.out.println(duplicateElementsCheckInArrayByHashing(arr));
	}
}
