package com.vedika.functionhall.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vedika.functionhall.model.Owner;

public interface OwnerRepository extends MongoRepository<Owner, String> {

	List<Owner> findAll();

	@Query("{'$or':[{ 'functionhall.name' : ?0 },{'functionhall.city':?0}]}")

	List<Owner> findFunctionHallByNameAndCity(String city, String name);

	@Query(value = "{'functionhall.mobileNumber' : ?0")
	List<Owner> sendOTP(String mobileNumber);

}
