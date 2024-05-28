package dawkhinthandarhlaingjava;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{12,29,13,16},{21,23,27,24},{25,17,28,16}};
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<4;col++)
			{
				System.out.println(b[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
