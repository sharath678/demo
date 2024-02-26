package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicle_id;
	private String vehicle_type;
	private String vehicle_name;
	public Vehicle() {
		super();
	}
	public Vehicle(int vehicle_id, String vehicle_type, String vehicle_name) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_type = vehicle_type;
		this.vehicle_name = vehicle_name;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_type=" + vehicle_type + ", vehicle_name=" + vehicle_name
				+ "]";
	}
	
}
