package dawkhinthandarhlaingjava;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		
		System.out.println("Enter Withdraw amount");
		int withdraw=sc.nextInt();
		
		if (balance>withdraw) {
		int inal = balance-withdraw;
		System.out.println(inal);
		}
		else 
			System.out.println("Not Enough Amount");
	}

}
