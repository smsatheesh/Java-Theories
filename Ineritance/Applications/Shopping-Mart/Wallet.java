class Wallet extends ShoppingCart {
	
	static double wallet_balance = 5.60;
	
	public void getBalance() {
		
		System.out.println( "Wallet Ballance : " + wallet_balance );		
	}
	
	public void rechargeBalance( double amt ) {
		
		if( amt > 0 ) {
			wallet_balance += amt;
			System.out.println( "Thanks for recharging !!" );
			System.out.println( "Your wallet balance : " + wallet_balance );
		}
		else
			System.out.println( "Recharge amount cannot be negative" );
	}
	
	public void updateBalance( double item_price ) {
		
		wallet_balance -= item_price;
		System.out.println( "Your updated wallet balance : " + wallet_balance );
	}
	
	public void bill( double item_price ) {
		
		if( item_price < wallet_balance ) {
			
			this.updateBalance( item_price );
			System.out.println( "Thanks for the purchase !!" );
		} else {
			
			Scanner getInp = new Scanner( System.in );
			System.out.println( "Low Balance !!" );
			double insufficientFund = item_price - wallet_balance;
			System.out.println( "Insufficient amount :: " + ( insufficientFund ) );
			System.out.println( "Click to proceed recharge (yes / Y / y) ? " );
			String userChoiceForRecharge = getInp.nextLine(); 
			if( 
				userChoiceForRecharge.equals( "yes" ) ||
				userChoiceForRecharge.equals( "Y" ) ||	
				userChoiceForRecharge.equals( "y" )
			  ) {
				
				System.out.println( "Enter recharge amount :: " );
				double rechargeAmount = getInp.nextDouble();
				
				if( rechargeAmount > 0 )
					this.rechargeBalance( rechargeAmount );
				else {
					
					System.out.println( "Amount cannot be negative" );
				}
			}
			
		}
	}
}
