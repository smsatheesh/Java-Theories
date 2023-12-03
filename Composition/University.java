class University {
	
	Integer universityCode;
	String nameOfUniversity;
	College college;
	
	public University( Integer univCode, String nameOfUniversity, College college ) {
		this.universityCode = univCode;
		this.nameOfUniversity = nameOfUniversity;
		this.college = college;
	}
	
	public Integer getUniversityCode() {
		return this.universityCode;
	}
	
	public String getUniversityName() {
		return this.nameOfUniversity;
	}
	
	public College getCollegeList() {
		return this.college;
	}
}