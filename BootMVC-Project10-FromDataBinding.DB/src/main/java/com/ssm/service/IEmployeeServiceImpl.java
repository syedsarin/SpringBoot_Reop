package com.ssm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.Employee;
import com.ssm.repository.IEmployeeRepo;

@Service
public class IEmployeeServiceImpl implements IserviceEmployee {

	@Autowired
	IEmployeeRepo empRepo;
	@Override
	public String insert(Employee emp) {
		
		Integer save = empRepo.save(emp).getEmployeeId();
		
		
		return save+"Record Inserted";
	}
	@Override
	public List<Employee> view() {
		List<Employee> find = empRepo.findAll();
		
		
		return find;
	}
	
	

	
	@Override
	public Employee findById(Integer empId) {
		
		return empRepo.findById(empId).orElseThrow(()-> new IllegalArgumentException("Not Found"));		
		
	}
	
	
	
	@Override
	public Employee update(Employee employee) {
		Employee save=null;	
		empRepo.findById(employee.getEmployeeId());
		
			
			save = empRepo.save(employee);
			
			return save;
		
		
		}
	@Override
	public String deleteById(Integer id) {
		
		empRepo.deleteById(id);
		return "Record Deleted";
	}

}
