 package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
//	
//	//Therr are some rule which we have to follow, the name start with findBy or getBy and then it should end with property
//	List<Alien> finByTech(String tech);
//	List<Alien> findByAidGreatedThan(int aid);
//	
//	//this is not valid name
//	@Query("from Alien where tech =?1 order by aname")
//	List<Alien> findByAidGreaterThan(String tech);
	
}
