package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class InterestOfABank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amount=sc.nextInt();
		System.out.println("How Many Years : ");
		int years=sc.nextInt();
		System.out.println("Enter Rate : ");
		double rate=sc.nextDouble();
		
		double interest = amount*years*rate;
		
		System.out.println("The Interest is " + interest);
	}

}
