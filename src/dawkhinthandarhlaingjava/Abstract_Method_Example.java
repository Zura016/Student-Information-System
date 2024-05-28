package dawkhinthandarhlaingjava;

//Regular class extends abstract class
class Abstract_Method_Example extends Multiply{
	// if the abstract methods are not implemented,compiler will give an error
	public int MultiplyTwo(int num1,int num2) {
		return num1*num2;
	}
	public int MultiplyThree(int num1,int num2,int num3) {
		return num1*num2*num3;
	}
	public static void main(String args[]) {
		Multiply obj=new Abstract_Method_Example();
		System.out.println("Multiplication of 2 numbers: " + obj.MultiplyTwo(10,50));
		System.out.println("Multiplication of 3 numbers: " + obj.MultiplyThree(5,8,10));
		obj.show();
	}
}