package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class GreatestNumberin3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number : ");
		int num3=sc.nextInt();
		
		if(num1>num2&&num1>num3) {
			System.out.println(num1 + " is Greatest Between 3 Number");}
		else if (num2>num1&&num2>num3) {
			System.out.println(num2 + " is Greatest Between 3 Number");}
		else if (num3>num1&&num3>num2) {
			System.out.println(num3 + " is Greatest Between 3 Number");}
		else 
			System.out.println(" They are equal ");
	}

}
