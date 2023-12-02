class ShoppingCart extends ShoppingList {
	
	public static double price( String itemName ) {
		
		double price = 0;
		
		if( itemName.equals( "Fruits" ) ) {
			price = 40.25;
		} else if( itemName.equals( "Vegetables" ) ) {
			price = 62.25;
		} else if( itemName.equals( "Drinks" ) ) {
			price = 45.26;
		} else if( itemName.equals( "Spices" ) ) {
			price = 63.29;
		} else if( itemName.equals( "Oils" ) ) {
			price = 75.50;
		}
		return price;
	}
}
