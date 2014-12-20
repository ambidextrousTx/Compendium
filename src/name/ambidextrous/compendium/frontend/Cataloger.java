package name.ambidextrous.compendium.frontend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Date;

import name.ambidextrous.compendium.core.InstalledSoftware;
import name.ambidextrous.compendium.core.Software;

/**
 * @author ambidextrous Allows a user to add an entry to the catalog
 * 
 */
public class Cataloger {
	public static void main(String[] args) {
		Cataloger cataloger = new Cataloger();
		cataloger.go();
	}

	private void go() {
		Path path = FileSystems.getDefault().getPath("./", "winamp.dmg");
		InstalledSoftware installedSoftware = new InstalledSoftware("WinAmp",
				"Music player, not used", "Music player", new Date(), path);
		
		catalog(installedSoftware);

	}
	
	private void catalog(Software software) {
		FileOutputStream foutStream;
		try {
			foutStream = new FileOutputStream(new File("Catalog.ser"));
			ObjectOutputStream outStream = new ObjectOutputStream(foutStream);
			outStream.writeObject(software);
			outStream.close();
			System.out.println("Serialized the object");
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the catalog file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output error");
			e.printStackTrace();
		}
		
	}

}
