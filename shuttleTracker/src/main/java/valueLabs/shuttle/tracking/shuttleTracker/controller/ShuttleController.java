package valueLabs.shuttle.tracking.shuttleTracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import valueLabs.shuttle.tracking.shuttleTracker.entities.DriverDetails;
import valueLabs.shuttle.tracking.shuttleTracker.entities.Shuttle;
import valueLabs.shuttle.tracking.shuttleTracker.entities.ShuttleStops;
import valueLabs.shuttle.tracking.shuttleTracker.entities.ShuttleTracking;
import valueLabs.shuttle.tracking.shuttleTracker.repositories.DriverRepository;
import valueLabs.shuttle.tracking.shuttleTracker.repositories.ShuttleRepository;
import valueLabs.shuttle.tracking.shuttleTracker.repositories.ShuttleStopsRepository;
import valueLabs.shuttle.tracking.shuttleTracker.repositories.ShuttleTrackingRepository;

@RestController
public class ShuttleController {
	@Autowired
	ShuttleRepository shuttleRepository;
	@Autowired
	DriverRepository driverRepository;
	@Autowired
	ShuttleTrackingRepository trackingRepository;
	@Autowired
	ShuttleStopsRepository stopsRepository;
	//SHUTTLE DETAILS
	@RequestMapping("/shuttleList")
	public List<Shuttle> getShuttles(){
		
		List<Shuttle> shuttleList = (List)shuttleRepository.findAll();
		
		return shuttleList;
	}
	//get shuttle details by shuttleId
		@RequestMapping(value="/getShuttleById/{shuttleId}",method = RequestMethod.GET )
	public  Shuttle getShuttleDetailsById(@PathVariable Long shuttleId ){
		Shuttle shuttle = shuttleRepository.findByShuttleId(shuttleId);
		return shuttle;
	}
		
	//add shuttle
	@RequestMapping(value="/addShuttle", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addShuttleDetails(@RequestBody Shuttle shuttle) {
		shuttleRepository.save(shuttle);
		return "Added shuttle successfully";
	}

	//update shuttle
	@RequestMapping(value="/updateShuttle", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateShuttleDetails(@RequestBody Shuttle updateshuttle) {
		Shuttle shuttle = shuttleRepository.findByShuttleId(updateshuttle.getShuttleId());
		shuttle.setShuttleName(updateshuttle.getShuttleName());
		shuttle.setDriverId(updateshuttle.getDriverId());
		shuttleRepository.save(shuttle);
		return " updated shuttle successfully";
	}
	
	//delete shuttle
	@RequestMapping(value="/deleteShuttle/{shuttleId}", method = RequestMethod.DELETE)
	public String deleteShuttle(@PathVariable Long shuttleId ) {
		shuttleRepository.delete(shuttleId);
		return "Deleted Shuttle successfully";
	}
	
	//DRIVER DETAILS
	@RequestMapping("/driverList")
	public List<DriverDetails> getDriversList(){
		List<DriverDetails> driverList = (List)driverRepository.findAll();
		return driverList;
	}

	//get driver details by shuttleId
	@RequestMapping(value="/getDriverById/{driverId}",method = RequestMethod.GET )
		public DriverDetails getDriverById(@PathVariable Long driverId ){
		DriverDetails driver = driverRepository.findByDriverId(driverId);
			return driver;
	}
	
	//add driver
	@RequestMapping(value="/addDriverList", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addDriverDetails(@RequestBody DriverDetails driverDetails) {
		driverRepository.save(driverDetails);
		return "Drived details saved successfully";
	}
	
	//update driver
	@RequestMapping(value="/updateDriver", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateDriver(@RequestBody DriverDetails updatedriver) {
		DriverDetails driver = driverRepository.findByDriverId(updatedriver.getDriverId());
		driver.setDriverName(updatedriver.getDriverName());
		driver.setDriverId(updatedriver.getDriverId());
		driver.setContactNumber(updatedriver.getContactNumber());
		driverRepository.save(driver);
		return " Driver updated successfully";
	}
		
	//delete driver
		@RequestMapping(value="/deleteDriver/{driverId}", method = RequestMethod.DELETE)
		public String deleteDriver(@PathVariable Long driverId ) {
			driverRepository.delete(driverId);
			return "Deleted driver successfully";
		}
	
	//TRACKING DETAILS
		@RequestMapping("/trackingList")
		public List<ShuttleTracking> getTrackingList(){
			List<ShuttleTracking> driverList = (List)trackingRepository.findAll();
			return driverList;
		}
	//get driver details by shuttleId
		@RequestMapping(value="/getTrackById/{trackId}",method = RequestMethod.GET )
			public ShuttleTracking getTrackerById(@PathVariable Long trackId ){
			ShuttleTracking tracker = trackingRepository.findByTrackId(trackId);
				return tracker;
		}

		
		//add driver
		@RequestMapping(value="/trackerList", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String addTrackerDetails(@RequestBody ShuttleTracking shuttleTracking) {
			trackingRepository.save(shuttleTracking);
			return "tracking details saved successfully";
		}
		
		//update driver
		@RequestMapping(value="/updateTracker", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateTracker(@RequestBody ShuttleTracking updatetracker) {
			ShuttleTracking tracker = trackingRepository.findByTrackId(updatetracker.getTrackId());
			tracker.setStopId(updatetracker.getStopId());
			tracker.setIsReached(updatetracker.getIsReached());
			tracker.setShuttleId(updatetracker.getShuttleId());
			tracker.setReachedTime(updatetracker.getReachedTime());
			trackingRepository.save(tracker);
			return " tracking updated successfully";
		}
			
		//delete driver
		@RequestMapping(value="/deleteDriver/{driverId}", method = RequestMethod.DELETE)
		public String deleteTrack(@PathVariable Long trackId ) {
			trackingRepository.delete(trackId);
		    return "Deleted tracker successfully";
		}
			
		//SHUTTLE STOPS  ShuttleStops  findByStopId
		@RequestMapping("/stopsList")
		public List<ShuttleStops> getStopList(){
			List<ShuttleStops> stopList = (List)stopsRepository.findAll();
			return stopList;
		}
		//get driver details by shuttleId
		@RequestMapping(value="/getStopById/{trackId}",method = RequestMethod.GET )
			public ShuttleStops getStopById(@PathVariable Long stopId ){
			ShuttleStops tracker = stopsRepository.findByStopId(stopId);
				return tracker;
		}

		
		//add driver
		@RequestMapping(value="/addShuttleStop", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String addTrackerDetails(@RequestBody ShuttleStops shuttleStop) {
			stopsRepository.save(shuttleStop);
			return "tracking details saved successfully";
		}
		
		//update driver
		@RequestMapping(value="/updateStopStatus", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateStopStatus(@RequestBody ShuttleStops ShuttleStop) {
			ShuttleStops stopStatus = stopsRepository.findByStopId(ShuttleStop.getStopId());
			stopStatus.setShuttleId(ShuttleStop.getShuttleId());
			stopStatus.setStopName(ShuttleStop.getStopName());
			stopStatus.setTrackId(ShuttleStop.getTrackId());
			stopsRepository.save(stopStatus);
			return " tracking updated successfully";
		}
			
		//delete driver
		@RequestMapping(value="/deleteDriver/{driverId}", method = RequestMethod.DELETE)
		public String deleteStop(@PathVariable Long stopId ) {
			stopsRepository.delete(stopId);
		    return "Deleted tracker successfully";
		}
			
}
