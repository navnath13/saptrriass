package com.saptrriass.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wid;
	private String workMode;
	private String workDescription;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Department> department=new LinkedHashSet<Department>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int wid, String workMode, String workDescription) {
		super();
		this.wid = wid;
		this.workMode = workMode;
		this.workDescription = workDescription;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getWorkMode() {
		return workMode;
	}

	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	@Override
	public String toString() {
		return "Category [wid=" + wid + ", workMode=" + workMode + ", workDescription=" + workDescription + "]";
	}
	
	
	


	
	
	
	



}
