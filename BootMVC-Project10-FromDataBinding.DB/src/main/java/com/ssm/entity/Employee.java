package com.ssm.entity;

import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emp_Info_New")
public class Employee {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "EMP_ID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Column(name = "Employee_Id")
	private Integer employeeId;   
	
	@Nonnull
	@Column(name = "Employee_Name")
	private String employeeName;
	
	@Nonnull
	@Column(name = "Employee_Department")
	private String employeeDepartment;
	
	@Nonnull
	@Column(name = "Company_Name")
	private String companyName;
	
	@Nonnull
	@Column(name = "Employee_Salary")
	private Double employeeSalary;
}
