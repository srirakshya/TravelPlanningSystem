package com.example.TravelPlanningSystem.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Component
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tripId;
	private String destination;
	private LocalDate startDate;
	private LocalDate endDate;
	private TransportationMode transportationMode;
	private AccomodationType accommodationType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ItineraryItem> itineraryItems;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Expense> expenses;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<DestinationReview> destinationReviews;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private TravelAgency trevelAgency;

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public TransportationMode getTransportationMode() {
		return transportationMode;
	}

	public void setTransportationMode(TransportationMode transportationMode) {
		this.transportationMode = transportationMode;
	}

	public AccomodationType getAccommodationType() {
		return accommodationType;
	}

	public void setAccommodationType(AccomodationType accommodationType) {
		this.accommodationType = accommodationType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ItineraryItem> getItineraryItems() {
		return itineraryItems;
	}

	public void setItineraryItems(List<ItineraryItem> itineraryItems) {
		this.itineraryItems = itineraryItems;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

	public List<DestinationReview> getDestinationReviews() {
		return destinationReviews;
	}

	public void setDestinationReviews(List<DestinationReview> destinationReviews) {
		this.destinationReviews = destinationReviews;
	}

	public TravelAgency getTrevelAgency() {
		return trevelAgency;
	}

	public void setTrevelAgency(TravelAgency trevelAgency) {
		this.trevelAgency = trevelAgency;
	}

	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", destination=" + destination + ", startDate=" + startDate + ", endDate="
				+ endDate + ", transportationMode=" + transportationMode + ", user=" + user + ", itineraryItems="
				+ itineraryItems + ", expenses=" + expenses + ", destinationReviews=" + destinationReviews
				+ ", trevelAgency=" + trevelAgency + "]";
	}
	
	

}
