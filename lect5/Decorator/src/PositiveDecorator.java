
public class PositiveDecorator implements Function{

	private Function base;
	
	public PositiveDecorator(Function base) {
		this.base =base;
	}
	
	@Override
	public int f(int i) {
		return base.f(i) >0 ? base.f(i):0;
	}
	
}
