package xmp;

public class MyArrays {
	
	public static void sort(Comparable[] a) {
		int i,j;
		for(i=0 ; i< a.length -1 ; i++)
			for( j = i+1 ; j< a.length ;j++)
				if(a[i].compareTo((Complex) a[j]) > 0) {
					Comparable t = a[i];
					a[i] = a[j];
					a[j] =t;
				}			
	}

}
