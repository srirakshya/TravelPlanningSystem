package com.example.TravelPlanningSystem.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class ItineraryItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itineraryItemId;
	private String activity;
	private LocalDate startTime;
	private LocalDate endTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Trip trip;

	@Override
	public String toString() {
		return "ItineraryItem [itineraryItemId=" + itineraryItemId + ", activity=" + activity + ", startTime="
				+ startTime + ", endTime=" + endTime + ", trip=" + trip + "]";
	}

	public int getItineraryItemId() {
		return itineraryItemId;
	}

	public void setItineraryItemId(int itineraryItemId) {
		this.itineraryItemId = itineraryItemId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}
