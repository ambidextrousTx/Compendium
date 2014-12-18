package name.ambidextrous.compendium.core;

import java.nio.file.Path;
import java.util.Date;

public class InstalledSoftware extends Software {
	public InstalledSoftware(String name, String remarks, String description,
			Date downloadDate, Path location) {
		this.name = name;
		this.remarks = remarks;
		 
		

	}
}
