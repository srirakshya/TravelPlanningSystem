package com.example.TravelPlanningSystem.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class TravelAgency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelAgencyId;
	private String travelAgencyName;
	private long travelAgencyContact;
	private String travelAgencyEmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Trip> trips;

	public int getTravelAgencyId() {
		return travelAgencyId;
	}

	public void setTravelAgencyId(int travelAgencyId) {
		this.travelAgencyId = travelAgencyId;
	}

	public String getTravelAgencyName() {
		return travelAgencyName;
	}

	public void setTravelAgencyName(String travelAgencyName) {
		this.travelAgencyName = travelAgencyName;
	}

	public long getTravelAgencyContact() {
		return travelAgencyContact;
	}

	public void setTravelAgencyContact(long travelAgencyContact) {
		this.travelAgencyContact = travelAgencyContact;
	}

	public String getTravelAgencyEmail() {
		return travelAgencyEmail;
	}

	public void setTravelAgencyEmail(String travelAgencyEmail) {
		this.travelAgencyEmail = travelAgencyEmail;
	}

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	@Override
	public String toString() {
		return "TravelAgency [travelAgencyId=" + travelAgencyId + ", travelAgencyName=" + travelAgencyName
				+ ", travelAgencyContact=" + travelAgencyContact + ", travelAgencyEmail=" + travelAgencyEmail
				+ ", trips=" + trips + "]";
	}
	
	

}
