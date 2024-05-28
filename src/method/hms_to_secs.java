package method;

import java.util.Scanner;

public class hms_to_secs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		do
		{Scanner sc=new Scanner(System.in);
		System.out.println("Enter h:m:s");
		int h=sc.nextInt();
		char chr=sc.next().charAt(0);
		int min=sc.nextInt();
		chr=sc.next().charAt(0);
		int sec=sc.nextInt();
		
		System.out.println("Total : " + hms_to_secs(h,min,sec));
	    System.out.println("Do Another? Yes OR No ");
	    ch=sc.next().charAt(0);
		} while (ch =='Y');		
	}

	private static long hms_to_secs(int h, int min, int sec) {
		// TODO Auto-generated method stub
		return  (h*3600)+(min*60)+sec;
	}
}
