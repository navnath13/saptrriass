package com.saptrriass.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saptrriass.entities.Department;
import com.saptrriass.entities.Job;

public interface JobRepository extends JpaRepository<Job, Long>{
	public List<Job> findByDepartmentDid(Long department);
	public List<Job> findByDepartmentDepartmentName(String departmentName);
	
	public List<Job> findByDepartmentCategoryWorkMode(String workMode);
	
	public List<Job> findByDepartmentDepartmentNameAndDepartmentCategoryWorkMode(String departmentName,String workMode);
    public List<Job> findByExperience(String experience);
}
