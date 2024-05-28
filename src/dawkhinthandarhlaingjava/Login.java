package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class Login {
	static String username;
	static String password;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Username ");
		 username=sc.nextLine();
		 
		System.out.println("Enter Password ");
		 password=sc.nextLine();
		
		login();
	}
	private static void login() {
		if(username.equals("Admin") && password.equals("123")) {
			System.out.println("Login Success!");
		}
		else {
			System.out.println("Login Fail");
		}
	}
}
