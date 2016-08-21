package cn.cxx.book;

public class WriteData {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("scores.txt");// create a file
															// object
		if (file.exists()) {
			System.out.println("File already exists");
			// System.exit(0);
		}

		// Create a file
		java.io.PrintWriter output = new java.io.PrintWriter(file);// create a
																	// printwriter
																	// object

		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(91);
		output.print("Eric K Jones ");
		output.println(85);
		System.out.println(file.getCanonicalPath());
		// Close the file
		output.close();
	}
}
