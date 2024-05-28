package method;

public class Student {

	
		int rollno;
		String name;
		static String university;
		
		public static void main(String[] args) {
			Student st=new Student();
			st.rollno=25;
			st.name="Koji";
			Student.university="IMU";
			System.out.println("Your Roll No " + st.rollno);
			System.out.println("Your Namne " + st.name);
			System.out.println("Your University " + university);
		}
		
	}


