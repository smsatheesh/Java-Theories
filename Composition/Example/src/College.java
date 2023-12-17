class College {
	
	public String collegeName;
	public String addressOfCollege;
	public Branch branches;
	
	public College( String name, String address, Branch branches ) {
		
		this.collegeName = name;
		this.addressOfCollege = address;
		this.branches = branches;
	}
	
	public String getCollegeName() {
		return this.collegeName;
	}
	
	public String getAddressOfCollege() {
		return this.addressOfCollege;
	}
	
	public Branch getDisplayOfAllBranches() {
		return this.branches;
	}
}