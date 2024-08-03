package com.ssm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssm.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{


}
