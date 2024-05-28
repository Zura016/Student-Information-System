package method;

import java.util.Scanner;

public class LinearSearch_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arry= {"AA","BB","CC","DD","EE","FF"};
		Scanner sc=new Scanner (System.in);
		String data=sc.nextLine();
		search(arry,data);
		}
private static void search(String[] arry,String data) {
	int i;
	for(i=0;i < arry.length;i++)
{
	if(arry[i].equals(data))
	{
	System.out.println(data+ "is found at " + i);
	break;
	}
}
	if(i== arry.length)
	{
		System.out.println(data+ " isn't found ");
	}
}
}
