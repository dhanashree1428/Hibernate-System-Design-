        package com.jsp.controller;

		import com.jsp.employeedto.EmployeeDto;
		import com.jsp.service.EmployeeService;

		public class EmployeeSave {

			public static void main(String[] args) {
				// TODO Auto-generated method stub/
		   EmployeeDto employeeDto=new EmployeeDto();
		   
		   employeeDto.setName("Rashmi");
		   employeeDto.setEmail("rashmi@mail.com");
		   EmployeeService employeeService=new EmployeeService();
		   employeeService.saveEmployee(employeeDto);
		   }
		   }

	


