package name.ambidextrous.compendium.core;

import java.nio.file.Path;
import java.util.Date;

public class InstalledSoftware extends Software {
	private static final long serialVersionUID = -7296655912984180513L;

	public InstalledSoftware(String name, String remarks, String description,
			Date downloadDate, Path location) {
		this.name = name;
		this.remarks = remarks;
		this.description = description;
		this.downloadDate = downloadDate;
		this.location = location;

	}
}
