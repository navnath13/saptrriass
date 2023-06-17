package com.saptrriass.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String jobTitle, experience,location,Description,Techology ,companyName;
    
	@ManyToOne(fetch = FetchType.EAGER)
	private Department department;

		
		
		
		
		
		
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Job(Long id, String jobTitle, String experience, String location, String description, String techology,
			String companyName) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.experience = experience;
		this.location = location;
		Description = description;
		Techology = techology;
		this.companyName = companyName;

	}


	
	







	public Long getId() {
		return id;
	}











	public void setId(Long id) {
		this.id = id;
	}











	public String getJobTitle() {
		return jobTitle;
	}











	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}











	public String getExperience() {
		return experience;
	}











	public void setExperience(String experience) {
		this.experience = experience;
	}











	public String getLocation() {
		return location;
	}











	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setLocation(String location) {
		this.location = location;
	}











	public String getDescription() {
		return Description;
	}











	public void setDescription(String description) {
		Description = description;
	}











	public String getTechology() {
		return Techology;
	}











	public void setTechology(String techology) {
		Techology = techology;
	}







	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", experience=" + experience + ", location=" + location
				+ ", Description=" + Description + ", Techology=" + Techology + ", companyName=" + companyName
				+ ", department=" + department + "]";
	}
	
	
   

}
