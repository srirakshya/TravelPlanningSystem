package com.example.TravelPlanningSystem.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class DestinationReview {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int destinationReviewId;
	private String destination;
	private int rating;
	private String comments;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Trip trip;

	public int getDestinationReviewId() {
		return destinationReviewId;
	}

	public void setDestinationReviewId(int destinationReviewId) {
		this.destinationReviewId = destinationReviewId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	@Override
	public String toString() {
		return "DestinationReview [destinationReviewId=" + destinationReviewId + ", destination=" + destination
				+ ", rating=" + rating + ", comments=" + comments + ", trip=" + trip + "]";
	}
	
	

}
