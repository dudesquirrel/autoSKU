package autoSKU;

public class GetSKUFromCSV {

	public static void getSingleItem(String filePath) {
		// option 0
		String[] items = null;
		// read in a line from the csv
		
		System.out.println(parseEnum(items));
	}

	
	public static void run(String filePath) {
		// option 1
		
		System.out.println("run");
		
		// School + "-" + Style + "-" + Gender + Size + Color
		
		// load csv values from value and pass them to getSingleItem to validate
		//	against the enums
		
	}

	
	private static String parseEnum(String[] items) {
		
		String outputString;
		
		if(items.length==5) {
			outputString = School.valueOf(items[0]).getSchool().toString() +
							"-"+
							Style.valueOf(items[1]).getStyle().toString() + 
							"-"+
							Gender.valueOf(items[2]).getGender().toString() + 
							Size.valueOf(items[3]).getSizeString().toString() + 
							Color.valueOf(items[4]).getColorString().toString();
		}else {
			outputString = Style.valueOf(items[0]).getStyle().toString() + 
							"-"+
							Gender.valueOf(items[1]).getGender().toString() + 
							Size.valueOf(items[2]).getSizeString().toString() + 
							Color.valueOf(items[3]).getColorString().toString();
		}
		
		return outputString;
	}
	
	public static String[] getDialogOptions(String enumType) {
		String[] dialogOptions = null;
		int i = 0;
		
		switch(enumType) {
		case("School"):
			dialogOptions = new String[School.values().length];
			for(School schoolName : School.values()) {
				dialogOptions[i] = schoolName.toString();
				i++;
			}
		case("Style"):
			dialogOptions = new String[Style.values().length];
			for(Style styleName : Style.values()) {
				dialogOptions[i] = styleName.toString();
				i++;
			}
		case("Gender"):
			dialogOptions = new String[Gender.values().length];
			for(Gender genderName : Gender.values()) {
				dialogOptions[i] = genderName.toString();
				i++;
			}
		case("Size"):
			dialogOptions = new String[Size.values().length];
			for(Size sizeString : Size.values()) {
				dialogOptions[i] = sizeString.toString();
				i++;
			}
		case("Color"):
			dialogOptions = new String[Color.values().length];
			for(Color colorString : Color.values()) {
				dialogOptions[i] = colorString.toString();
				i++;
			}
			
		}
		
		return dialogOptions;
	}
	
}