package method;

import java.util.Scanner;

public class RectangleArea {
	static int height,width,result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base of Rectangle");
		width=sc.nextInt();
		System.out.println("Enter Height of Rectangle");
		height=sc.nextInt();
		
		area(width,height);
		
	}
	public static void area(int height,int width) {
		result=height*width;
		System.out.println("The area of rectangle is " + result);
	}
}
