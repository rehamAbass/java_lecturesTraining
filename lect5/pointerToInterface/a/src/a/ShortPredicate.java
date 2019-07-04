package a;

public class ShortPredicate implements Predicate{

	@Override
	public boolean f(String s) {
		return s.length() <= 3;
	}

	
}
