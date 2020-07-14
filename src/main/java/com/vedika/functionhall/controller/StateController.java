package com.vedika.functionhall.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vedika.functionhall.model.CountryDetails;
import com.vedika.functionhall.model.Details;
import com.vedika.functionhall.model.FunctionHallUIResponse;
import com.vedika.functionhall.model.ResponseForStates;
import com.vedika.functionhall.model.States;
import com.vedika.functionhall.service.StateService;

@Controller
@RestController
@RequestMapping(value = "/api")
public class StateController {

	Logger logger = LoggerFactory.getLogger(StateController.class);

	@Autowired
	private StateService stateService;

	@PostMapping(value = "/cities")
	public ResponseEntity<?> saveOrUpdateOwner(@RequestBody Details details) {
		stateService.saveOrUpdateOwner(details);
		return new ResponseEntity("functionhall details added successfully", HttpStatus.OK);
	}

	@GetMapping(value = "AllStates")
	public List<Details> getBystate() {
		return stateService.findAll();
	}

	@GetMapping(value = "state/details")

	public Details response(@RequestParam(value = "country", required = false) String name) {
		Details details=new Details();
		details = stateService.findByName(name);
		return details;	
			}
		
	

	@GetMapping(value = "city/details")

	public Details getstate(@RequestParam(value = "state", required = false) String name) {
		Details details = stateService.findByStateName(name);
     
return details;
}
}
