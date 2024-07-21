package com.microservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int vaccinationcenterid;
	public Citizen() {
		super();
	}
	public Citizen(int id, String name, int vaccinationcenterid) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationcenterid = vaccinationcenterid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVaccinationcenterid() {
		return vaccinationcenterid;
	}
	public void setVaccinationcenterid(int vaccinationcenterid) {
		this.vaccinationcenterid = vaccinationcenterid;
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationcenterid=" + vaccinationcenterid + "]";
	}
	
	

}
