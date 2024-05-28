package dawkhinthandarhlaingjava;

import java.util.Arrays;

public class Array_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Stu_Height = {175,167,160,164,183,187,188,179,176,175,169,175,176,178};
		Arrays.sort(Stu_Height);
		System.out.println(Arrays.toString(Stu_Height));
		int sum=0;
		for(int i=0;i<Stu_Height.length;i++)
		{
			sum+=Stu_Height[i];
		}
		System.out.println("Sum : " + sum);
		int avg=sum/2;
		System.out.println("Average Height : " + avg);
		System.out.println("Shortest Height : " + Stu_Height[0]);
		System.out.println("Highest Height : " + Stu_Height[13]);
		
	}

}
