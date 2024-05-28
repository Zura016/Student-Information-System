package OOP_Programming;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(110,"Htin Shar Htike");
		Student s2=new Student();
		
		s2.id=110;
		s2.name="Phone Thaw Naing";
		
		s1.display();
		s2.display();
	}

}
