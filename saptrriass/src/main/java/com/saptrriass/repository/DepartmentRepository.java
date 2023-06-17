package com.saptrriass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saptrriass.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
