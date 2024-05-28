package method;

public class MathClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.sin(180));
		System.out.println(Math.cos(90.0));
		System.out.println(Math.pow(2,3));
		System.out.println("Ceile " + Math.ceil(4.3));
		System.out.println("Floor " + Math.floor(4.8));
		System.out.println("Round " + Math.round(4.6));
		System.out.println(Math.rint((4.5)));
		System.out.println("Maximum " + Math.max(45, 25));
		System.out.println("Minimum " + Math.min(45, 25));
		System.out.println("Absolute Value " + Math.abs(-5));
		int r=(int) (Math.random()*27);
		System.out.println(r+1);
	}
	
}
