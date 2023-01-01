package autoSKU;

public enum Gender {
	
	// Type
	BOYS("BY"),
	GIRLS("GL"),
	MEN("MN"),
	WOMEN("JR"),
	YOUTHUNISEX("UY"),
	ADULTUNISEX("UA");
	
	private final String gender;
	
	Gender(String gender){
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	

}
