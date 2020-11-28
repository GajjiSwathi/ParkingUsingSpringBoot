package com.parking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String vehicleType;
	private int vehicleNumber;

	public Parking() {

	}

	public Parking(Long id, String vehicleType, int vehicleNumber) {
		this.id = id;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

}
