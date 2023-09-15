package com.jsp.controller;

import com.jsp.employeedto.EmployeeDto;
import com.jsp.service.EmployeeService;

public class EmployeeUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setEmail("omkar@mail.com");
		
		 EmployeeService employeeService=new EmployeeService();
		 employeeService.updateEmployee(employeeDto);
	}

}
