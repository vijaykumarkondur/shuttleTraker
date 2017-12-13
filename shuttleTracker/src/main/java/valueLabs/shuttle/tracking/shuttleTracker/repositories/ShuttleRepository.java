package valueLabs.shuttle.tracking.shuttleTracker.repositories;

import org.springframework.data.repository.CrudRepository;

import valueLabs.shuttle.tracking.shuttleTracker.entities.Shuttle;

public interface ShuttleRepository extends CrudRepository<Shuttle, Long> {
 
	public Shuttle findByShuttleId(Long id);
	
	 
}
