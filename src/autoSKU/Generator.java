package autoSKU;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;

public class Generator {

	public static void main(String[] args) throws IOException {
		
		JFrame frame = new JFrame("FrameDemo");

		Object[] options = {"Single Item",
                "Multiple Items (csv)",
                "Exit"};
		int n = JOptionPane.showOptionDialog(frame,
		"What type of input do you have?",
		"Auto-SKU Generator",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		options,
		options[2]);
		
		switch(n) {
		case(0):
			// Single Item from dialog

			
		case(1):

			JFileChooser jfilechooser = new JFileChooser();
			jfilechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
	                "CSV File", "csv", "txt");
			
			jfilechooser.setFileFilter(filter);
			
	        int returnVal = jfilechooser.showOpenDialog(null);
	        if(returnVal == JFileChooser.APPROVE_OPTION) {
	            String filePath = jfilechooser.getSelectedFile().getCanonicalPath();
	            System.out.println("You chose to open this file: " +
	            		jfilechooser.getSelectedFile().getName());
		        GetSKUFromCSV.run(filePath);
	        	}

		
		case(2):
			// Exit Program
		}
		System.out.println("Done");
        
	}

}
