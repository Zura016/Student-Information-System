package method;

import java.util.Scanner;

public class Sumofthenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2");
		int num2=sc.nextInt();
		
		/*int result=num1+num2;
		System.out.println("The Result is " + result);*/
		int result =sumreturn(num1,num2);
			System.out.println("Sum of the Numbers " + result);
	}
	public static void sum(int num1,int num2) {
	
		int result=num1+num2;
		System.out.println("The Sum = " + result);
	}
	public static int sumreturn(int num1,int num2) {
		int result = num1+num2;
		return result;
		
	}
}
