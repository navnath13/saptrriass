package com.saptrriass.entities;

import java.util.LinkedHashSet;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;



@Entity
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long did;
	private String departmentName;
	private String description;
	private boolean ative;

	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;

	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JsonIgnore
	private Set<Job> job = new LinkedHashSet<Job>();


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(Long did, String departmentName, String description, boolean ative, Category category,
			Set<Job> job) {
		super();
		this.did = did;
		this.departmentName = departmentName;
		this.description = description;
		this.ative = ative;
		this.category = category;
		this.job = job;
	}


	public Long getDid() {
		return did;
	}


	public void setDid(Long did) {
		this.did = did;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isAtive() {
		return ative;
	}


	public void setAtive(boolean ative) {
		this.ative = ative;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Set<Job> getJob() {
		return job;
	}


	public void setJob(Set<Job> job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", departmentName=" + departmentName + ", description=" + description
				+ ", ative=" + ative + ", category=" + category + ", job=" + job + "]";
	}
	
	
	
	




	
	
	
	
	
	
	
	

	
	
	

}
