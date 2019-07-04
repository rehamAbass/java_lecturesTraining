package xmp;
public class Complex implements Comparable{

	private double re ,im;
	public Complex(int x,int y) { re=x; im=y;}
	public double norm() { 
		return Math.sqrt( Math.pow(re,2)+Math.pow(im,2));
	}
	
	@Override
	public int compareTo(Complex  other) {
		return other.norm() == norm()? 0:other.norm() > norm()?-1:1;
	}
	
	@Override
	public String toString() {
		return String.format("(%.0f,%.0f)",this.re,this.im);
	}

}
