package valueLabs.shuttle.tracking.shuttleTracker.repositories;

import org.springframework.data.repository.CrudRepository;

import valueLabs.shuttle.tracking.shuttleTracker.entities.DriverDetails;

	public interface DriverRepository extends CrudRepository<DriverDetails, Long> {
		public DriverDetails findByDriverId(Long id);
	}
