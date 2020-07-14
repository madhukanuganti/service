
package com.vedika.functionhall.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "functionhall_reference_data")
public class Owner {
	@Id
	private String id;
	private String name;

	private String firstName;

	private String lastName;
	private String functionhallname;
	private String country;
	private String streetAddress;
	private String unitNumber;
	private String state;
	private String city;
	private String postalCode;
	

	
	private String ownerContactNumber;

	/* db ref */

	private List<FunctionHall> functionhall;
	private List<AccountDetails> accountdetails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFunctionhallname() {
		return functionhallname;
	}
	public void setFunctionhallname(String functionhallname) {
		this.functionhallname = functionhallname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getOwnerContactNumber() {
		return ownerContactNumber;
	}
	public void setOwnerContactNumber(String ownerContactNumber) {
		this.ownerContactNumber = ownerContactNumber;
	}
	public List<FunctionHall> getFunctionhall() {
		return functionhall;
	}
	public void setFunctionhall(List<FunctionHall> functionhall) {
		this.functionhall = functionhall;
	}
	public List<AccountDetails> getAccountdetails() {
		return accountdetails;
	}
	public void setAccountdetails(List<AccountDetails> accountdetails) {
		this.accountdetails = accountdetails;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", functionhallname=" + functionhallname + ", country=" + country + ", streetAddress=" + streetAddress
				+ ", unitNumber=" + unitNumber + ", state=" + state + ", city=" + city + ", postalCode=" + postalCode
				+ ", ownerContactNumber=" + ownerContactNumber + ", functionhall=" + functionhall + ", accountdetails="
				+ accountdetails + "]";
	}
	

	
}