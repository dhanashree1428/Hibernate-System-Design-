package com.jsp.controller;

import com.jsp.employeedto.EmployeeDto;
import com.jsp.service.EmployeeService;

public class EmployeeGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EmployeeDto employeeDto=new EmployeeDto();
		 
		 EmployeeService employeeService=new EmployeeService();
		   employeeService.getAllEmployees();
	}

}
