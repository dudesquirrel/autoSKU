package autoSKU;

public enum School {
	
	KEYSGATE("KGE", "Keysgate"),
	LAKEWOOD("LWE", "Lakewood"),
	MANATEE("MTE", "Manatee"),
	NORTHBROWARD("NBE", "North Broward"),
	TRADHS("TRADHS", "Traditional HS"),
	DCHS("DCHS", "DCHS"),
	NOSCHOOLSPECIFIED("", "No School Specified");
	
	private final String school;
	private final String longSchool;
	
	School(String school, String longSchool){
		this.school = school;
		this.longSchool = longSchool;
	}
	
	public String getSchool() {
		return school;
	}
	
	public String getLongSchool() {
		return longSchool;
	}

}
