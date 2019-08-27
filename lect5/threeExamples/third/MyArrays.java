package e2;

public class MyArrays {

	public static void sort(Comparable [] a) {
		int i,j;
		Comparable pointer;
		for(i=0 ; i <a.length -1 ; i++)
			for(j=0 ; j< a.length ; j++) {
				if(a[i].compareTo(a[j]) == 1) {
					pointer =a[i];
					a[i]= a[j];
					a[j] = pointer;
				}//if
			}//for
		
	} // sort
}
