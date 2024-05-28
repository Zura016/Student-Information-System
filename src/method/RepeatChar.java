package method;

public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatchar();
		repeatchar('#');
		repeatchar('*',30);
	}
	private static void repeatchar() {
		
		for (int i = 1;i<=30;i++) {
			System.out.print("$");
		}
		System.out.println();
	}
	private static void repeatchar(char c) {
		for (int i = 1;i<=30;i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	private static void repeatchar(char c,int n) {
		for (int i = 1;i<=n;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
