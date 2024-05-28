package dawkhinthandarhlaingjava;

import java.util.Arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,45,22,30,65,27,65,95};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//*******************************************
		int  key=65;
		int result=Arrays.binarySearch(array, key);
		System.out.println(key + " is found at index : " + result);
		//*******************************************
		int[] B= Arrays.copyOf(array,3);
		System.out.println(Arrays.toString(B));
		//*******************************************
		System.out.println(Arrays.equals(array, B));
		//*******************************************
		Arrays.fill(B,10);
		System.out.println(Arrays.toString(B));
		//*******************************************
		
		
	}

}
