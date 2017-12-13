package valueLabs.shuttle.tracking.shuttleTracker.repositories;

import org.springframework.data.repository.CrudRepository;

import valueLabs.shuttle.tracking.shuttleTracker.entities.ShuttleTracking;

public interface ShuttleTrackingRepository  extends CrudRepository<ShuttleTracking, Long> {
	 
	public ShuttleTracking findByTrackId(Long id);
		
		 
}
