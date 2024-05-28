package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks");
		int mark=sc.nextInt();
		
		if(mark>=40&&mark<=79) {
			System.out.println("Pass!");
		}
		else if(mark<40) {
			System.out.println("Fail!");
		}
		else if(mark>=80) {
			System.out.println("Distinction");
		}
		else 
			System.out.println("Wrong Input");
	}

}
