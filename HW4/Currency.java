public class Currency extends Magnitude{
	private int myDollars;
	private int myCents;
	public Currency(int dollars, int cents)
	{
		myDollars = dollars;
		myCents = cents;
	}
	protected void setCurrency(int dollars, int cents)
	{
		myDollars = dollars;
		myCents = cents;
	}
	protected double magnitude()
	{
		//myDollars + myCents / 100 = currency amount
		return (myDollars + (double)(myCents/100));
	}
	@Override
	protected boolean lessThan (Magnitude c)
	{
		//compare based on magnitude
		if(this.magnitude() < ((Currency)(c)).magnitude())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
