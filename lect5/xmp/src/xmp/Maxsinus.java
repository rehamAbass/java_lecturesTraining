package xmp;

public class Maxsinus implements DoubleComparator{

	public int compareTo(double x, double y) {
		return Double.compare(Math.sin(x), Math.sin(y));
	}
	

	
}
