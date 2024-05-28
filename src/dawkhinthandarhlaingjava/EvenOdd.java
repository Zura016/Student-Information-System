package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num1=sc.nextInt();
		
		if(num1%2==0) {
			System.out.println("It's Even");
		}
		else
			System.out.println("It's Odd");
	}

}
