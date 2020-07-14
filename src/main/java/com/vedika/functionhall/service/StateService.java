package com.vedika.functionhall.service;


import java.util.List;
import com.vedika.functionhall.model.Details;
import com.vedika.functionhall.model.ResponseForStates;

public interface StateService {
	Details saveOrUpdateOwner(Details details);

	Details findByName(String name);
	Details findByStateName(String name);
	
	List<Details> findAll();





}