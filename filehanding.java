package DAY27;
import java.io.*;
public class filehanding {
	public static void main(String[] args) {

		// how to create a folder
		// how to create a sub folder
		// how to create a file
		// how to delete a file
		// how to rename a file or folder
		// list all files and folders file.listFiles -> f.getName()
		// show only files file.listFiles -> f.isFile()
		// show only folders file.listFiles -> f.isDirectory()
		// how to write in a text file
		// how to read a text file
		
        File folder = new File ("C:\\Users\\Zephy\\Documents\\java\\filehandling\\text.txt");
		  if (!folder.exists()) {
		folder.mkdirs(); 
        System.out.println("Folder created.");

	}      
	        File subFolder = new File(folder, "SubFolder");
	        if (!subFolder.exists()) {
	            subFolder.mkdir();
	            System.out.println("Sub-folder created.");
	        }
	        
	        
	        //  Create a file
	        File file = new File(subFolder, "sample.txt");
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created.");
	            }
	        } catch (IOException e) {
	            System.out.println("File creation failed: " + e.getMessage());
	        }

	        //   Write into the file
	        try (FileWriter fw = new FileWriter(file, true);
	             BufferedWriter bw = new BufferedWriter(fw)) {
	            bw.write("Hello World!");
	            bw.newLine();
	            bw.write("This is a Java file handling example.");
	            System.out.println("Writing successful.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Read from the file
	        try (FileReader fr = new FileReader(file);
	             BufferedReader br = new BufferedReader(fr)) {
	            String line = br.readLine();
	            System.out.println("\n--- Reading File ---");
	            while (line != null) {
	                System.out.println(line);
	                line = br.readLine();
	            }
	        } catch (IOException e) {
	            System.out.println("Reading failed: " + e.getMessage());
	        }

	        //List all files and folders
	        System.out.println("\n--- All files and folders in main folder ---");
	        File[] listFiles = folder.listFiles();
	        if (listFiles != null) {
	            for (File f : listFiles) {
	                System.out.println(f.getName());
	            }
	        }

	        // Show only files
	        System.out.println("\n--- Only files ---");
	        for (File f : subFolder.listFiles()) {
	            if (f.isFile()) {
	                System.out.println(f.getName());
	            }
	        }

	        // Show only folders
	        System.out.println("\n--- Only folders ---");
	        for (File f : folder.listFiles()) {
	            if (f.isDirectory()) {
	                System.out.println(f.getName());
	            }
	        }

	        //  Rename a file
	        File newFileName = new File(subFolder, "renamed_sample.txt");
	        if (file.renameTo(newFileName)) {
	            System.out.println("File renamed to: " + newFileName.getName());
	        }

	        //  Delete the file
	        if (newFileName.delete()) {
	            System.out.println("File deleted.");
	        }

	        //  Delete folder/subfolder 
	        if (subFolder.delete()) {
	            System.out.println("Subfolder deleted.");
	        }}}
	        



