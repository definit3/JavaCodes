package com.hsc.controllers.employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsc.controllers.Customer;


@RestController
public class EmployeeController {
	
	private static Map<Integer, Employee> employee;

	public EmployeeController() {
		employee = new HashMap<Integer, Employee>();
		employee.put(101, new Employee(101, "Ramana",10000));
		employee.put(201, new Employee(201, "Sudhir",20000));
		employee.put(301, new Employee(301, "Kishore",30000));

	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public Collection<Employee> getEmployee() {
		return employee.values();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee/{id}/{name}/{sal}", produces = "application/json")

	public ResponseEntity saveCustomer(@PathVariable("id") Integer id, @PathVariable("name") String name, @PathVariable("sal") Integer sal)
	{
		Employee employees = employee.get(id);
		if (employees != null) {
			return new ResponseEntity("Employee id already exists",HttpStatus.BAD_REQUEST);
		}
		employees=new Employee(id,name,sal);
		employee.put(id, employees);
		return new ResponseEntity("employee created successfully", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employee/{id}", produces = "application/json")

	public ResponseEntity saveEmployee(@PathVariable("id") Integer id)
	{
		Employee employees = employee.get(id);
		if (employees != null) {
			return new ResponseEntity(employees,HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity("employee doesnt exist", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}", produces = "application/json")

	public ResponseEntity deleteEmployee(@PathVariable("id") Integer id)
	{
		Employee employees = employee.get(id);
		if (employees != null) {
			employee.remove(id);
			return new ResponseEntity("Employee deleted successfully",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity("employee doesnt exist", HttpStatus.OK);
	}

}
