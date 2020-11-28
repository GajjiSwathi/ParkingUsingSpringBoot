package com.parking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.model.Parking;
import com.parking.repository.ParkingRepository;

@Service
public class ParkingService {

	@Autowired
	ParkingRepository parkingRepository;

	public void addParking(Parking parking) {
		parkingRepository.save(parking);

	}

	public List<Parking> getAllParking() {
		return parkingRepository.findAll();
	}

	public Optional<Parking> getParking(Long id) {
		return parkingRepository.findById(id);
	}

	public void updateParking(Parking parking) {
		parkingRepository.save(parking);
	}

	public void deleteParking(Parking parking) {
		parkingRepository.delete(parking);
	}

}
