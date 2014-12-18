package name.ambidextrous.compendium.core;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Date;

/**
 * @author ambidextrous
 * Represents the basic entity of a Software
 * in the system
 *
 */
public abstract class Software implements Serializable {
	private static final long serialVersionUID = -6412858596220642998L;

	protected boolean moved;
	
	protected String name;
	protected String remarks;
	protected String description;
	
	protected Date downloadDate;
	protected Path location;
	
	// Getters
	public boolean isMoved() {
		return moved;
	}
	public String getName() {
		return name;
	}
	public String getRemarks() {
		return remarks;
	}
	public String getDescription() {
		return description;
	}
	public Date getDownloadDate() {
		return downloadDate;
	}
	public Path getLocation() {
		return location;
	}
	
	// hashCode() and equals()
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((downloadDate == null) ? 0 : downloadDate.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + (moved ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Software other = (Software) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (downloadDate == null) {
			if (other.downloadDate != null)
				return false;
		} else if (!downloadDate.equals(other.downloadDate))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (moved != other.moved)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		return true;
	}
}
