package dawkhinthandarhlaingjava;

		class Puppy{
			private int puppyAge; //private data field
			//This construtor has one parameter name.
			public Puppy(String name) {
				System.out.println("Name chosen is :" + name);
			}
			//Setter Method
			public void setAge(int age) {
				puppyAge = age;
			}
			//getter method
			public int getAge() {
				return puppyAge;
				
			}
			
		}
	
