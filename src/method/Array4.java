package method;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] cube=new int[10];
		  for(int i=0;i<cube.length;i++)
		  {
			  cube[i]=(i+i)*(i+i)*(i+i);
		  }
		  System.out.println("No\tCube");
		  for(int i=0;i<cube.length;i++)
		  {
			  cube[i]=(i+1)*(i+1)*(i+1);
			  System.out.println((i+1)+"\t"+cube[i]);
		  }

	        
	}

}
