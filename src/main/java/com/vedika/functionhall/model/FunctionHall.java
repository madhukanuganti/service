package com.vedika.functionhall.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

public class FunctionHall {
	@Id
	private String id;
	private String name;
	private String ownerId;
	private String ownerFirstName;
	private String ownerLastName;
	private String functionhalldescription;
	private String headline;
	private String[] functionhallType;
	private String  foodType;
	private int maximumGuest;
	private String roomType;
	private String functionhallContactNumber;
	private String street;
	private String state;
	private String city;
	private int zipcode;
	private String email;
	private String[] imageUrl;
	private String bucketName;
	private String imageDirectoryPath;
	private String corelationId;
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
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
	public String getFunctionhalldescription() {
		return functionhalldescription;
	}
	public void setFunctionhalldescription(String functionhalldescription) {
		this.functionhalldescription = functionhalldescription;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String[] getFunctionhallType() {
		return functionhallType;
	}
	public void setFunctionhallType(String[] strings) {
		this.functionhallType = strings;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getMaximumGuest() {
		return maximumGuest;
	}
	public void setMaximumGuest(int maximumGuest) {
		this.maximumGuest = maximumGuest;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getFunctionhallContactNumber() {
		return functionhallContactNumber;
	}
	public void setFunctionhallContactNumber(String functionhallContactNumber) {
		this.functionhallContactNumber = functionhallContactNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String[] imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getBucketName() {
		return bucketName;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	public String getImageDirectoryPath() {
		return imageDirectoryPath;
	}
	public void setImageDirectoryPath(String imageDirectoryPath) {
		this.imageDirectoryPath = imageDirectoryPath;
	}
	public String getCorelationId() {
		return corelationId;
	}
	public void setCorelationId(String corelationId) {
		this.corelationId = corelationId;
	}
	@Override
	public String toString() {
		return "FunctionHall [id=" + id + ", name=" + name + ", ownerId=" + ownerId + ", ownerFirstName="
				+ ownerFirstName + ", ownerLastName=" + ownerLastName + ", functionhalldescription="
				+ functionhalldescription + ", headline=" + headline + ", functionhallType=" + functionhallType
				+ ", foodType=" + foodType + ", maximumGuest=" + maximumGuest + ", roomType=" + roomType
				+ ", functionhallContactNumber=" + functionhallContactNumber + ", street=" + street + ", state=" + state
				+ ", city=" + city + ", zipcode=" + zipcode + ", email=" + email + ", imageUrl="
				+ Arrays.toString(imageUrl) + ", bucketName=" + bucketName + ", imageDirectoryPath="
				+ imageDirectoryPath + ", corelationId=" + corelationId + "]";
	}
	
}