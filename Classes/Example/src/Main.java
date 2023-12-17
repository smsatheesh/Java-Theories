class Main {

	public static void main(String args[]) {
	
		Bike bikeObject = new Bike();
		bikeObject.nameOfBike = "R-15";
		bikeObject.vechileNumber = "STATE_CODE _ _ SERIAL_NUMBER _ _ _ _";
		bikeObject.colorOfBike = "Dark knight";
		bikeObject.modelNo = 4;
		bikeObject.categoryOfBike = "Sport";
		System.out.println( "Category Of Bike : " + bikeObject.categoryOfBike );
		System.out.println( "Model Of Bike : " + bikeObject.nameOfBike );
		System.out.println( "Model Number of Bike : " + bikeObject.modelNo );
		System.out.println( "Color Of Bike : " + bikeObject.colorOfBike );
		System.out.println( "Vechile Number : " + bikeObject.vechileNumber );
		
	}
}