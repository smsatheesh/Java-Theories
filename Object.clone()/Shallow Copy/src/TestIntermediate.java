class TestIntermediate implements Cloneable {
	
	int a, b;
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return ( "a= " + a + ", b= " + b + ", x= " + c.x + ", y= " + c.y );
	}
}