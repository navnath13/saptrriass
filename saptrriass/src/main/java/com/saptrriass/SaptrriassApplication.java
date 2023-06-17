package com.saptrriass;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saptrriass.entities.Category;
import com.saptrriass.entities.Department;
import com.saptrriass.entities.Job;
import com.saptrriass.repository.CategoryRepository;
import com.saptrriass.repository.DepartmentRepository;
import com.saptrriass.repository.JobRepository;

@SpringBootApplication
public class SaptrriassApplication implements CommandLineRunner {
	@Autowired
    public JobRepository jobRepository;
	@Autowired
    public DepartmentRepository departmentRepository;
	@Autowired
    public CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(SaptrriassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println("programm is started");
		// TODO Auto-generated method stub
		
		/*
		 * Job job=new Job();
		 * 
		 * job.setCompanyName("TechPharm"); job.setJobTitle("Data Enter Operator");
		 * job.setExperience("0"); job.setLocation("salapur");
		 * job.setTechology("typing 30 /40MPW , marathi 30 ");
		 * 
		 * Job job1=new Job(); job1.setCompanyName("Econ");
		 * job1.setJobTitle("Data Enter Operator"); job1.setExperience("1");
		 * job1.setLocation("nanded");
		 * job1.setTechology("Typing marathi 30,English 30/40 ");
		 * 
		 * 
		 * Set<Job> jobSet=new LinkedHashSet<Job>(); jobSet.add(job); jobSet.add(job1);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Category category=new Category(); category.setWorkMode("hybrid");
		 * 
		 * 
		 * 
		 * Department department=new Department(); department.setDepartmentName("Data");
		 * department.setCategory(category); department.setAtive(false);
		 * department.setDescription("this department contain all job related to data");
		 * department.setJob(jobSet);
		 * 
		 * 
		 * System.out.println(department);
		 * 
		 * job.setDepartment(department); job1.setDepartment(department);
		 * 
		 * this.categoryRepository.save(category);
		 * this.departmentRepository.save(department);
		 * 
		 * this.jobRepository.save(job);
		 */
	
		
		
	}

}
