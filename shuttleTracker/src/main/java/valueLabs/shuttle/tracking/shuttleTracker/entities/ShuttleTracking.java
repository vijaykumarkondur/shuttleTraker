package valueLabs.shuttle.tracking.shuttleTracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "shuttleTrackingDetails")
public class ShuttleTracking {
	@Id
	Long stopId ;
	@Column
	Boolean isReached;
	@Column
	String shuttleId;
	@Column
	String reachedTime;
	@Column
	Long trackId;
	
	public Long getTrackId() {
		return trackId;
	}
	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}
	public Long getStopId() {
		return stopId;
	}
	public void setStopId(Long stopId) {
		this.stopId = stopId;
	}
	public Boolean getIsReached() {
		return isReached;
	}
	public void setIsReached(Boolean isReached) {
		this.isReached = isReached;
	}
	public String getShuttleId() {
		return shuttleId;
	}
	public void setShuttleId(String shuttleId) {
		this.shuttleId = shuttleId;
	}
	public String getReachedTime() {
		return reachedTime;
	}
	public void setReachedTime(String reachedTime) {
		this.reachedTime = reachedTime;
	}
}
