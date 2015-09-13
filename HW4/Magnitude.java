public abstract class Magnitude {
	abstract protected boolean lessThan (Magnitude m);
	protected boolean lessThanEqualTo (Magnitude m)
	{
		//less than or equal to == lessThan() || equalTo()
		return ((this.lessThan(m)) || (this.equalTo(m)));
	}
	protected boolean equalTo (Magnitude m)
	{
		//equal to == not less than either way
		return (!this.lessThan(m) && !m.lessThan(this));
	}
	protected boolean greaterThanEqualTo (Magnitude m)
	{
		//greater than or equal to == !lessThan()
		return !this.lessThan(m);
	}
	protected boolean greaterThan (Magnitude m)
	{
		//greater than == !lessThan() && !notEqual()
		return (!this.lessThan(m) && !this.equalTo(m));
	}
	protected boolean notEqual(Magnitude m)
	{
		//not equal == !(equal)
		return !this.equalTo(m);
	}
}
