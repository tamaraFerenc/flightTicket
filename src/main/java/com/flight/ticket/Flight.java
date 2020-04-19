package com.flight.ticket;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	int id;
	String origin;
	String destination;
	Date departureDate;
	Date arrivalDate;
	String name;
	int age;
	boolean hasLuggage;
	double price;
	String departureTime;
	String arrivalTime;
		
	public Flight(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHasLuggage() {
		return hasLuggage;
	}

	public void setHasLuggage(boolean hasLuggage) {
		this.hasLuggage = hasLuggage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Flight(int id, String origin, String destination, Date departureDate, Date arrivalDate, String name, int age,
			boolean hasLuggage, double price, String departureTime, String arrivalTime) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.name = name;
		this.age = age;
		this.hasLuggage = hasLuggage;
		this.price = price;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	
}
