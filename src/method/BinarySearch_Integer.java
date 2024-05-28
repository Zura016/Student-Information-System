package method;

import java.util.Scanner;

public class BinarySearch_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String[] arry= {"A","B","C","D","E","F","G","H","I"};
		System.out.println("Enter search data " );
		String data=sc.nextLine();
		binarysearch(arry,data);
	}
	
	public static void binarysearch(String[] arry,String data)
	{
		int first=0;
		int last=arry.length-1;
		int mid;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(data.compareTo(arry[mid])<0)
			{
				last=mid-1;
			}
			else if(data.compareTo(arry[mid])>0)
			{
				first=mid+1;
			}
			else
			{
				System.out.println(data+" is found at " + mid);
				break;
			}
		}
	}
}
