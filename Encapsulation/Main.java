class Main {

	public static void main(String args[]) {
	
		Bike bikeObject = new Bike( "Sport", "R-15", "Dark knight", "STATE_CODE _ _ SERIAL_NUMBER _ _ _ _", 4 );

		System.out.println( "Category Of Bike : " + bikeObject.getCategoryOfBike() );
		System.out.println( "Model Of Bike : " + bikeObject.getNameOfBike() );
		System.out.println( "Model Number of Bike : " + bikeObject.getModelNumber() );
		System.out.println( "Color Of Bike : " + bikeObject.getColorOfBike() );
		System.out.println( "Vechile Number : " + bikeObject.getVechileNumber() );
		
	}
}