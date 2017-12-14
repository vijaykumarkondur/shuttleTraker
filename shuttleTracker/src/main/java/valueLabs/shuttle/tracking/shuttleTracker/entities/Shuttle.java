package valueLabs.shuttle.tracking.shuttleTracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shuttleDetails")
public class Shuttle {
	
	@Id @GeneratedValue
	Long shuttleId ;
	
	@Column
	String shuttleName;
	
	@Column
	String driverId;
	
	public Long getShuttleId() {
		return shuttleId;
	}
	public void setShuttleId(Long shuttleId) {
		this.shuttleId = shuttleId;
	}
	public String getShuttleName() {
		return shuttleName;
	}
	public void setShuttleName(String shuttleName) {
		this.shuttleName = shuttleName;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
}


