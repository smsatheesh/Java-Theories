public class Main {

	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
			
			System.out.println("Please choose the product");
	        System.out.println("-------------------------");
	        System.out.println("Press 1 for fruits");
	        System.out.println("Press 2 for Vegetables");
	        System.out.println("Press 3 for Drinks");
	        System.out.println("Press 4 for Spices");
	        System.out.println("Press 5 for Oils");
	        System.out.println("Please select an item from the above list");
		
	        int item_code = sc.nextInt();
	        Wallet obj = new Wallet();
	        String item_name =  obj.listItem(item_code);
	        double price = obj.price(item_name);
	        obj.bill(price);
	        
	        System.out.println( "Press ( 'y' / 'Y' ) to proceed shooping ? " );
	        choice = sc.next().charAt(0);
		} while( choice == 'y' || choice == 'Y' );
		
		System.out.println( "Thanks for the Shopping !!" );
	}
}
