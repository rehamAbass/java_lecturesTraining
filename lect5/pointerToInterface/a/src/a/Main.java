package a;

public class Main {

	public static void main(String[] args) {
		String []a= {"The", "times", "they", "are", "a", "changin"};
		System.out.println(Counter.count(a, new ShortPredicate()));
		System.out.println(Counter.count(a, new IPredicate()));
	}

}
