public class CartPoint extends Magnitude {
	private double myX;
	private double myY;
	public CartPoint(double x, double y)
	{
		myX = x;
		myY = y;
	}
	protected void setCartPoint(double x, double y)
	{
		myX = x;
		myY = y;
	}
	protected double magnitude()
	{
		//distance from origin
		return Math.sqrt(Math.pow(myX, 2) + Math.pow(myY, 2));
	}
	@Override
	protected boolean lessThan(Magnitude c)
	{
		//less than
		if(this.magnitude() < ((CartPoint)(c)).magnitude())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
