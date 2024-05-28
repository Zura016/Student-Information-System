package dawkhinthandarhlaingjava;

abstract class Multiply{
	//abstract methods
	//sub class must implement these method
	public abstract int MultiplyTwo(int n1,int n2);
	public abstract int MultiplyThree(int n1,int n2,int n3);
	
	//Regular method with body
	public void show(){
		System.out.println("Method of abstract class Multiply");
	}
}
