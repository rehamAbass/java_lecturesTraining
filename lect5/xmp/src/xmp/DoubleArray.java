package xmp;

public class DoubleArray {
	private double [] a; // refrence to array of doubles
	public DoubleArray(int size) {
		a= new double[size];
	}
	public void set(int i , double d) { a[i]=d;}
	public double get(int i) {return a[i];}
	
	public double max(DoubleComparator c) {
		double max = a[0];
		for(double d: a)
			if( ((Maxsinus)c).compareTo(d,max) > 0) 
				max =d; 
		return max;
	}
	
	
	
}
