abstract class Animal {
	
	private String animalName;
	
	public Animal( String nameOfAnimal ) {
		this.animalName = nameOfAnimal;
	}
	
	protected abstract void category();
	
	public void eating() {
		
		System.out.println( animalName + " eating..." );
	}
	
	public void sleeping() {
		
		System.out.println( animalName + " .... Zzzzz..." );
	}
}