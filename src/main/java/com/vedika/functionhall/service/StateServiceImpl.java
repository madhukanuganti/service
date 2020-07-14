package com.vedika.functionhall.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.vedika.functionhall.model.Details;
import com.vedika.functionhall.model.ResponseForStates;
import com.vedika.functionhall.model.States;
import com.vedika.functionhall.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository; 


	@Override
	public Details saveOrUpdateOwner(Details details) {
		return stateRepository.save(details);
	}


	@Override
	public Details findByName(String name) {			
		return stateRepository.findByName(name);
	}


	@Override
	public List<Details> findAll() {
		return stateRepository.findAll();
	}


	@Override
	public Details findByStateName(String name) {
		// TODO Auto-generated method stub
		return stateRepository.findByStateName(name);
	}





}
