package method;

import java.util.Arrays;

public class BubbleSort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arry={"A","E","D","B","C"};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arry));
		sort(arry);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arry));
		
	}
	public static void sort(String[] arry) {
		for(int i=0;i<arry.length-1;i++) {
			for(int j=1;j<arry.length-i;j++) {
				if(arry [j-1].compareTo(arry[j])>0)
						{
						String temp=arry[j-1];
						arry[j-1]=arry[j];
						arry[j]=temp;
						}
			}
		}
	}

}
