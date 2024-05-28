package method;

import java.util.Scanner;

public class Change_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter 1 to convert F to C /N Enter 2 to convert C to F");
		int op = sc.nextInt();
		if(op==1) {
			System.out.println("Enter Fahrenheit : ");
			double f=sc.nextDouble();
			
			double c=(f-32)/1.8;
			System.out.println("Celsius : " + c);
		}
		else if (op==2){
			System.out.println("Enter Celsius : ");
			double c=sc.nextDouble();
			
			double f=(c*1.8)+32;
			System.out.println("Enter Fahrenheit : " + f);
		}
		else 
			System.out.println("WRONG INPUT");
	}

}
