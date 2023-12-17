class ProgrammingLanguage implements Language {
	
	private String nameOfLanguage;
	
	public ProgrammingLanguage( String language ) {
		this.nameOfLanguage = language;
	}
	
	@Override
	public String getLanguageName() {
		return ( "Hi, I'm from " + domain + " domain and language is " + this.nameOfLanguage);
	}
}