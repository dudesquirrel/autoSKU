package autoSKU;

public enum Color {
	KHAKI("KH"),
	BLACK("BK"),
	RED("RD"),
	WHITE("WT"),
	LIGHTGREY("LG"),
	GOLD("GD"),
	NAVY("NV"),
	LIGHTBLUE("LB"),
	ROYAL("RY"),
	EMERALDGREEN("EG"),
	HEATHERGREYWBLUE("HB"),
	NAVYWITHWHITECOLORBLOCK("NWB"),
	BLACKWITHGOLDCOLORBLOCK("BGB"),
	NAVYWITHLIGHTGREYCOLORBLOCK("NGB"),
	HUNTERGREEN("HG"),
	MIAMITEALANDBLACK("MTB"),
	NAVYBLUE("NB");
	
	private final String colorString;
	
	Color(String colorString) {
		this.colorString = colorString;
	}
	
	public String getColorString() {
		return colorString;
	}

}
