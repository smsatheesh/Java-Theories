public class Bike {
		
	private String nameOfBike, vechileNumber, colorOfBike, categoryOfBike;
	private int modelNo;

	public Bike( String categoryOfBike, String nameOfBike, String colorOfBike, String vechileNumber, int modelNo ) {

		this.categoryOfBike = categoryOfBike;
		this.nameOfBike = nameOfBike;
		this.colorOfBike = colorOfBike;
		this.vechileNumber = vechileNumber;
		this.modelNo = modelNo;
	}

	public void setName( String name ) {

		this.nameOfBike = name;
	}

	public void setVechileNumber( String number ) {
		 
		this.vechileNumber = number;
	}

	public void setColorForBike( String color ) {

		this.colorOfBike = color;
	}

	public void setCategoryForbike( String category ) {

		this.categoryOfBike = category;
	}

	public void setModelNo( int number ) {

		this.modelNo = number;
	}

	public String getCategoryOfBike() {
		return this.categoryOfBike;
	}

	public String getNameOfBike() {
		return this.nameOfBike;
	}

	public String getColorOfBike() {
		return this.colorOfBike;
	}

	public String getVechileNumber() {
		return this.vechileNumber;
	}

	public int getModelNumber() {
		return this.modelNo;
	}
}