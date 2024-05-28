package method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Number");
		int num1=sc.nextInt();
		
		System.out.println(sum);
		
	}
	public static int number(int num1) {
		int sum= 0 ;
		for(int i=num1;i>=1;i--)
		{
			sum += i;
		}
		return sum;
	}
}
