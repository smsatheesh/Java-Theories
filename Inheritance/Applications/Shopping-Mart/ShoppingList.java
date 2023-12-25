class ShoppingList {
	
	static String listItem( int itemCode ) {
		
		String item_name = "";
		
		switch( itemCode ) {
			
			case 1 :
	            item_name = "Fruits";
	            System.out.println("Item name is " + item_name);
	           return item_name;
	           
	        case 2:
	            item_name = "Vegetables";
	            System.out.println("Item name is " + item_name);
	            return item_name;
	            
	        case 3:item_name = "Drinks";
	            System.out.println("Item name is " + item_name);
	            return item_name;
	
	        case 4:
	            item_name = "Spices";
	            System.out.println("Item name is " + item_name);
	           return item_name;
	
	        case 5:
	            item_name = "Oils";
	            System.out.println("Item name is " + item_name);
	            return item_name;
		
			default:
				System.out.println( "Wrong item selected !!" );
				break;
		}
		return item_name;
	}
}