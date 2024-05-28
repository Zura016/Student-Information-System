package method;

public class Staticmethodexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.show();
		Demo demo=new Demo();
		demo.display();
	}

	
}

class Demo 
{
	//non static method 
	void display()
	{
		System.out.println("Non Static Display Method ");
	}
	//static method 
	static void show()
	{
		System.out.println("Static show Method ");
	}
}