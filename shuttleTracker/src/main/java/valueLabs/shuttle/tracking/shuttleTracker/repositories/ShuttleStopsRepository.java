package valueLabs.shuttle.tracking.shuttleTracker.repositories;

import org.springframework.data.repository.CrudRepository;

import valueLabs.shuttle.tracking.shuttleTracker.entities.ShuttleStops;

public interface ShuttleStopsRepository  extends CrudRepository<ShuttleStops, Long> {
	 
	public ShuttleStops findByStopId(Long id);
		
		 
}

