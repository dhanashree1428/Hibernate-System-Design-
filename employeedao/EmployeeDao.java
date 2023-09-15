package com.jsp.employeedao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.employeedto.EmployeeDto;


public class EmployeeDao {

	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public EmployeeDto saveEmployee(EmployeeDto employee) {
	  employee.getId();
	  employee.getName();
	  employee.getEmail();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		return employee;
		}
	
	public EmployeeDto deleteEmployee(EmployeeDto employee) {
		
		EmployeeDto employeeDto=entityManager.find(EmployeeDto.class,5);
	    
	    if(employeeDto!=null) {
	    	entityTransaction.begin();
	    	entityManager.remove(employeeDto);
	    	entityTransaction.commit();
	    }
	    else {
	    	System.out.println("Not Deleted");
	    }
		
		return employee;
	}
	public EmployeeDto updateEmployee(EmployeeDto employee){ 
		   
		EmployeeDto employeeDto=entityManager.find(EmployeeDto.class,2);
		if(employeeDto!=null) {
		   entityTransaction.begin();
		   entityManager.merge(employeeDto);
		   entityTransaction.commit();
		   }else {
			   System.out.println("Not Updated");
		   }
		   return employee;
		}
	
	public List<EmployeeDto>getAllEmployees(){
		String sql="Select e from Employeedto e";
		Query query=entityManager.createQuery(sql);
		List<EmployeeDto> employeeDtos =query.getResultList();
		return employeeDtos;
		
		
	}
	}
	
		
	
