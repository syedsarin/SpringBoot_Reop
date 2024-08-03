package com.ssm.service;

import java.util.List;
import java.util.Optional;

import com.ssm.entity.Employee;

public interface IserviceEmployee {
	
	public String insert(Employee emp);
	
	public List<Employee> view();
	
	public Employee findById(Integer empId);
	
	public Employee update(Employee employee);
	
	public String deleteById(Integer id);

}
