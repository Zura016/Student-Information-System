package method;

import java.util.Scanner;

public class Inches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yard : ");
		double yard=sc.nextDouble();
		
		System.out.println("Enter feet : ");
		double feet=sc.nextDouble();
		
		System.out.println("Enter Inches ");
		double inches=sc.nextDouble();
		
		double total=inches+(feet*12)+(yard*36);
		
		System.out.println("Total Inches" + total);
		System.out.println(String.format("%.3f",total));
		
	}

}
