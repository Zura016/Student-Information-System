package dawkhinthandarhlaingjava;

public class My_Calculation extends Calculation{
	public void multiplication(int x,int y) {
		z = x * y;
	System.out.println("The prroduct of the given numbers: " + z);
	}
	public static void main(String args[]) {
		int a =20,b=10;
		My_Calculation demo = new My_Calculation();
		demo.adddition(a, b);;demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}

	}


