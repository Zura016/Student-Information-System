package method;

import java.util.Arrays;

public class BubblesortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry={5,1,12,-5,16};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arry));
		sort(arry);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arry));
		
	}
	public static void sort(int[] arry) {
		for(int i=0;i<arry.length-1;i++) {
			for(int j=1;j<arry.length-i;j++) {
				if(arry [j-1]>arry[j])
						{
						int temp=arry[j-i];
						arry[j-i]=arry[j];
						arry[j]=temp;
						}
			}
		}
	}
}
