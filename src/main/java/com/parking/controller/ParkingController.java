package com.parking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.model.Parking;
import com.parking.services.ParkingService;

@RestController
@RequestMapping("/api")
public class ParkingController {

	@Autowired
	ParkingService parkingService;

	@PostMapping("/parking")
	public void addParking(@RequestBody Parking parking) {
		parkingService.addParking(parking);

	}

	@GetMapping("/allparkingAvailable")
	public List<Parking> getAllParking() {
		return parkingService.getAllParking();

	}

	@GetMapping("/parking/{id}")
	public Optional<Parking> getParking(@PathVariable Long id) {
		return parkingService.getParking(id);

	}
	@PutMapping("/parking/{id}")
	public void updateParking(@RequestBody Parking parking,@PathVariable Long id) {
		parkingService.updateParking(parking);
		
	}
	@DeleteMapping("/parking/{id}")
	public void deleteParking(@RequestBody Parking parking,@PathVariable Long id) {
		parkingService.deleteParking(parking);
		
	}

}
