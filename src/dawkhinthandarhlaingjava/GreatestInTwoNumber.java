package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class GreatestInTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " is Greatest Between Two Number");}
		else if (num2>num1) {
			System.out.println(num2 + " is Greatest Between Two Number");}
		else 
			System.out.println(" Both are equal ");
		}
	}


