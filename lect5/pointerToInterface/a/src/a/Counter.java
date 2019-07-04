package a;

public class Counter {

	public static int count(String []arr ,Predicate pred) {
		int counter = 0;
		for(String i:arr)
			if(pred.f(i)) counter ++;			
		return counter;
	}
}
