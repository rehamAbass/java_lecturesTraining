package e2;

public class Complex implements Comparable{

	private double re, im;
	
	public Complex(double re , double im){
			this.im =im;
			this.re =re;
	}
	/////
	public double norm() {  // to norm  the complex number
		return Math.sqrt(re*re + im*im);
	}
	/////
	@Override
	public int compareTo(Object other) {
		if(!( other instanceof Complex)) return 1000;
		double mine = this.norm();
		Complex o = (Complex)other;
		double otherNorm = o.norm();
		return ( mine > otherNorm ? 1:(mine == otherNorm ?0:-1));
	}
	/////
	@Override
	public String toString() {
		return String.format("\n%.1f  ,	%.1f i  	norm %.1f", this.re, this.im , this.norm());
	}
	//////
	
}
