package com.example.TravelPlanningSystem.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.TravelPlanningSystem.entity.User;
import com.example.TravelPlanningSystem.repo.UserRepository;

public class UserDao {
	
	@Autowired
	UserRepository repo;

	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public User findUser(int userId)
	{
		Optional<User> opUser = repo.findById(userId);
		
		if(opUser.isPresent())
		{
			return opUser.get();
		}
		return null;
	}
	
	public User deleteUser(int userId)
	{
		User user = findUser(userId);
		repo.delete(user);
		return user;
	}
	
	public User updateUser(User user,int userId)
	{
		User exUser = findUser(userId);
		if(exUser != null)
		{
			user.setUserId(userId);
			return repo.save(user);
		}
		return null;
	}
	
	public List<User> findAllUsers()
	{
		return repo.findAll();
	}
	

}
