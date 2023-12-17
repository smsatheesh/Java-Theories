class Lion extends Animal {

	String nameOfAnAnimal;
	public Lion( String name ) {
		super( name );
		this.nameOfAnAnimal = name;
	}
	
	public void category() {
		
		System.out.println( nameOfAnAnimal + " is an wild animal" );
	}
}