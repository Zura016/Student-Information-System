package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class DKTDHjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		double r =sc.nextDouble();
		 
		double area=3.142*r*r;
		System.out.println("The equation of the area of the circle is A=3.142*radius*radius");
		System.out.println("Since radius is " + r);
		System.out.println("So area of the circle is " + area);
		}

}
