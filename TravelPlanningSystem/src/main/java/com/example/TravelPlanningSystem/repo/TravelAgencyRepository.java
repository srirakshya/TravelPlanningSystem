package com.example.TravelPlanningSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelPlanningSystem.entity.TravelAgency;

public interface TravelAgencyRepository extends JpaRepository<TravelAgency, Integer> {

}
