class TestIntermediate implements Cloneable {
	
	int a, b;
	Test c = new Test();

	public Object clone() throws CloneNotSupportedException  {
		
		TestIntermediate testObj = ( TestIntermediate ) super.clone();
		
		testObj.c = new Test();
		testObj.c.x = c.x;
		testObj.c.y = c.y;
		return testObj;
	}
	
	@Override
	public String toString() {
		return ( "a= " + a + ", b= " + b + ", x= " + c.x + ", y= " + c.y );
	}
}