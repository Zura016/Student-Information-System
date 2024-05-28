package method;

import java.util.Scanner;

public class Calculator_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2");
		int num2=sc.nextInt();
		System.out.println("Enter Operator ");
		char op=sc.next().charAt(0);
		switch(op)
		{
		case'+':
			System.out.println(fadd(num1,num2));break;
		case'-':
				System.out.println(fsub(num1,num2));break;
		case'*':
			System.out.println(fmul(num1,num2));break;
		case'/':
			System.out.println(fdiv(num1,num2));break;
		}
		
	}
	private static int fadd(int num1,int num2) {
		return (num1+num2);
	}
	private static int fsub(int num1,int num2) {
		return (num1-num2);
	}
	private static int fmul(int num1,int num2) {
		return (num1*num2);
	}
	private static int fdiv(int num1,int num2) {
		return (num1/num2);
	}

}
