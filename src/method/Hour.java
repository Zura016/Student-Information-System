package method;

import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hour");
		double hr=sc.nextDouble();
		
		System.out.println("Enter Minute");
		double min=sc.nextDouble();
		
		System.out.println("Enter Second");
		double sec=sc.nextDouble();
		
		double total=(hr)+(min/60)+(sec/3600);
		System.out.println("Total second is " + total);
	}

}
