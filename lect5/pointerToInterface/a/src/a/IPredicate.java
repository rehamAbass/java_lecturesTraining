package a;

public class IPredicate implements Predicate{

	@Override
	public boolean f(String s) {
		return s.charAt(0) == 't'|| s.charAt(0)== 'T';
	}
	
}
