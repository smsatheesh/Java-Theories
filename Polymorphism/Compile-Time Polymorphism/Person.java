class Person {
	
	String name;
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public void setName( String firstName, String lastName ) {
		this.name = firstName + " " + lastName;
	}
	
	public void setName( String firstName, String middleName, String lastName ) {
		this.name = firstName + "" + middleName + " " + lastName;
	}
	
	public String getName() {
		return this.name;
	}
}