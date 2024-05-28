package dawkhinthandarhlaingjava;

public class GetSetMethod_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("tommy");
		/*Call class method to set puppy's age */
		myPuppy.setAge(2);
		
		/*Call another class method to get puppy's age*/
		System.out.println("Puppy's age is : " + myPuppy.getAge());
	}

}
