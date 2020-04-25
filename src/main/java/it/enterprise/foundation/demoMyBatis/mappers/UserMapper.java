package it.enterprise.foundation.demoMyBatis.mappers;

import java.util.List;
import it.enterprise.foundation.demoMyBatis.model.User;

public interface UserMapper {
	
	/**
	 * Retrieve all User from database
	 * */
	public List<User> getAll();
	
	/**
	 * Retrieve a User from database that has a particular id passed with param 
	 * */
	public User getById(Integer id);
	
	/**
	 * Retrieve a User from database that has a particular age passed with param 
	 * */
	public User getByAge(Integer age);
	
	/**
	 * Save a User into database 
	 * */
	public void save(User user);
	
	/**
	 * Update a User into database 
	 * */
	public void update(User user);
	
	
	/**
	 * Delete a User into database that has a particular id passed with param
	 * */
	public void delete(Integer id);
}