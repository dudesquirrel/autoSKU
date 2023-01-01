package autoSKU;

public enum Size {
	// Youth Sizes
	YXXS("YXXS"),
	YXS("YXS"),
	YS("YS"),
	YM("YM"),
	YL("YL"),
	YXL("YXL"),
	
	// Adult Sizes
	XXS("XXS"),
	XS("XS"),
	S("S"),
	M("M"),
	L("L"),
	XL("XL"),
	DOUBLEXL("2XL"),
	TRIPLEXL("3XL"),
	
	// Numeric Sizes
	INTEGER("INTEGER"),     // for sizes that are just number, e.g., 10, 12, 40, etc.
	NUMBERMOD("NUMBERMOD"); // FOR SIZES LIKE "8 H" OR "6x" etc.

	private final String sizeString;
	
	Size(String sizeString){
		this.sizeString = sizeString;
	}
	
	public String getSizeString() {
		return sizeString;
	}

}
