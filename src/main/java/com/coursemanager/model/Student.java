package com.coursemanager.model;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private String fullName;
	private Calendar birthDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(final Calendar birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
}
