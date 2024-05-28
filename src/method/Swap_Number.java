package method;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		swap(a,b);
		
	}
	public static void swap(int a,int b) {
		System.out.println("Before Swipping ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c=a;
		a = b;
		b = c;
		
		System.out.println("After Swapping ");
		System.out.println(" a = " + a);
		System.out.println(" b = " + b );
	}
}
