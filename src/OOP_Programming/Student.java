package OOP_Programming;

public class Student {
	int id;
	String name;
	public Student() {
		id=0;
		name="";
	}
	public Student(int ID,String stName) {
		id=ID;
		name=stName;
	}
	public void display() {
		System.out.println("Student information");
		System.out.println("ID = " + id + " \n Name " + name);
	}
}
