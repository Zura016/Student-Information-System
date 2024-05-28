package method;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {4,10,12,2,15,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search data ");
		int data=sc.nextInt();
		int i;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==data) {
			System.out.println(data+" is found at "+i);
			break;
			}
		
		else {
			System.out.println(data + " isn't found");
			break;
			}
		}
	}

}
