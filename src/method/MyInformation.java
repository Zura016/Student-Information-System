package method;

import java.util.Scanner;

public class MyInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("My Information");
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		System.out.println("Enter your address :");
		String address=sc.next();
		sc.nextLine();
		System.out.println("Enter your Height :");	
		double height=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your phone number :");
		String ph=sc.nextLine();
				display(name,age,address,height,ph);
				
				Student st=new Student();
				st.rollno=35;
				st.name="Koji";
				Student.university="IMU";
				System.out.println("Your Roll No " + st.rollno);
				System.out.println("Your Name " + st.name);
				System.out.println("Your University " +Student.university);
				
		/*System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		System.out.println(ph);*/
	}
		public static void display(String name,int age,String address,double height,String ph) {
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("Address : " + address);
			System.out.println("Height : " + height);
			System.out.println("Phone Number : " + ph);
		}
	
		

	}


