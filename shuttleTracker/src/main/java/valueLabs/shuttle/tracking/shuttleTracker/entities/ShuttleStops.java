package valueLabs.shuttle.tracking.shuttleTracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shuttleStopDetails")
public class ShuttleStops {
	
	@Id @GeneratedValue
	Long stopId;
	
	@Column
	String shuttleId;
	
	@Column
	String stopName;
	
	@Column
	Long trackId;
	
	public Long getStopId() {
		return stopId;
	}
	public void setStopId(Long stopId) {
		this.stopId = stopId;
	}
	public String getShuttleId() {
		return shuttleId;
	}
	public void setShuttleId(String shuttleId) {
		this.shuttleId = shuttleId;
	}
	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public Long getTrackId() {
		return trackId;
	}
	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}
}
