package autoSKU;

public enum Style {
	// Style Type
	SHORTPANTS("SPT"),
	PANTS("PTS"),
	POLO("POL"),
	TWOPKTVARSITYJACKET("2VJ"),
	VARSITYJACKET("VJ"),
	SKIRT("SKT");
	
	private final String styleType;
	
	Style(String styleType){
		this.styleType = styleType;
	}
	
	public String getStyle() {
		return styleType;
	}

}
