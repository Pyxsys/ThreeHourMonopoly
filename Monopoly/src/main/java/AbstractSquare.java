public abstract class AbstractSquare implements ISquare {
	protected String name;
	
	public String getName() {
		return this.name;
	}
	
	public abstract void action();
}
