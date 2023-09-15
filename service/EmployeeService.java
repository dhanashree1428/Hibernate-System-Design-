package com.jsp.service;

import java.util.List;

import com.jsp.employeedao.EmployeeDao;
import com.jsp.employeedto.EmployeeDto;

public class EmployeeService {
   EmployeeDao employeeDao=new EmployeeDao();
	
	public EmployeeDto saveEmployee(EmployeeDto employee) {
		return employeeDao.saveEmployee(employee);
	}
	public EmployeeDto deleteEmployee(EmployeeDto employee) {	
	return employeeDao.deleteEmployee(employee);
	}
	public EmployeeDto updateEmployee(EmployeeDto employee){
	return employeeDao.updateEmployee(employee);
	}
	public List<EmployeeDto>getAllEmployees(){
	return employeeDao.getAllEmployees();
	}
}
