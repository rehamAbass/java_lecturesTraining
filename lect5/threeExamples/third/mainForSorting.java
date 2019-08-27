package e2;

import java.util.Arrays;

public class mainForSorting {

	public static void main(String[] args) {
	
		Complex a = new Complex(1,1);
		Complex b = new Complex(2,0);
		Complex c = new Complex(3,3);
		Complex d = new Complex(3,0);
		Complex [] arr = {a,b,c,d};
		MyArrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		double [] array = {9.0 , 7.8 , 5.6};
		System.out.println(Arrays.toString(array));
	}

}
