package com.saptrriass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saptrriass.entities.Department;
import com.saptrriass.entities.Job;
import com.saptrriass.repository.DepartmentRepository;
import com.saptrriass.repository.JobRepository;

@RestController
@RequestMapping("/job")
public class JobController {
	@Autowired
	public JobRepository jobRepository;
	@Autowired
	public DepartmentRepository departmentRepository;
	
	@GetMapping("/{id}")
	public Job AllJob(@PathVariable("id")Long id){
		
		return this.jobRepository.findById(id).get();
	
	}
	
	
	@GetMapping("/")
	public List<Job> getAllJob(){
		
		return this.jobRepository.findAll();
	
	}
	@GetMapping("departmentId/{department}")
	public List<Job> getDepartmentId(@PathVariable("department") Long department){
		
		return this.jobRepository.findByDepartmentDid(department);
	}
	@GetMapping("departmentName/{departmentName}")
	public List<Job> getDepartmentByDepartmentName(@PathVariable("departmentName") String departmentName){
		
		return this.jobRepository.findByDepartmentDepartmentName(departmentName);
	}
	
	@GetMapping("WorkMode/{workMode}")
	public List<Job> getJobByWorkMode(@PathVariable("workMode") String workMode){
		return this.jobRepository.findByDepartmentCategoryWorkMode(workMode);
	}
	
	@GetMapping("/depatmentAndWorkMode/{departmentName}/{workMode}")
	public List<Job> getJobByDepartmentAndWorkMode(@PathVariable("departmentName")String departmentName, @PathVariable("workMode") String workMode){
	return	this.jobRepository.findByDepartmentDepartmentNameAndDepartmentCategoryWorkMode(departmentName, workMode);
		
	}
	
	@RequestMapping("experience/{experience}")
	public List<Job> getJobExperience(@PathVariable("experience") String experience){
		return this.jobRepository.findByExperience(experience);
		
	}
	
	

}
