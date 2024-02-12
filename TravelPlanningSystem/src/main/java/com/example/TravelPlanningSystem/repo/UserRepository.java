package com.example.TravelPlanningSystem.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TravelPlanningSystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
