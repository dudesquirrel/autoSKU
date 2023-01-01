package autoSKU;

public enum SKU {
	
	SKUwithSCHOOL("SKU Contains a School ID"),
	SKU("Generic SKU NOT Containing School ID");
	
	private final String sku;
	
	SKU(String sku){
		this.sku = sku;
	}
	
	public String getSKU(String school, String style, String gender, String size, String color) {
		return School.valueOf(school).getSchool() + Style.valueOf(style).getStyle() + Gender.valueOf(gender).getGender() + Size.valueOf(size).getSizeString() + Color.valueOf(color).getColorString();
	}

	public String getSkuType() {
		return sku;
	}

}
