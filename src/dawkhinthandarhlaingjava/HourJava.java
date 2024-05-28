package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class HourJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hour");
		int hr=sc.nextInt();
		
		System.out.println("Enter Minute");
		int min=sc.nextInt();
		
		System.out.println("Enter Second");
		int sec=sc.nextInt();
		
		int total=(hr*3600)+(min*60)+sec;
		System.out.println("Total second is " + total);
		
	}

}
