package method;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		double r=sc.nextDouble();
		area(r);
		
	}
	private static void area (double r) {
		double result = Math.PI*Math.pow(r, 2);
		System.out.println("Circle Area : " + result);
	}
}
