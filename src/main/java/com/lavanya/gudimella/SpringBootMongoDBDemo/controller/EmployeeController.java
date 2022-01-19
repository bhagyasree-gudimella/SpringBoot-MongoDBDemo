package com.lavanya.gudimella.SpringBootMongoDBDemo.controller;

import java.util.List; 
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavanya.gudimella.SpringBootMongoDBDemo.model.Employee;
import com.lavanya.gudimella.SpringBootMongoDBDemo.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/addEmployee",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping(path="/findEmployee/{employee_id}")
	public Optional<Employee> getEmployee(@PathVariable ObjectId employee_id) {
		return employeeService.getEmployee(employee_id);
	}
	
	@GetMapping(path="/findEmployees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PutMapping(path="/updateEmployee/{employee_id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@PathVariable ObjectId employee_id, @RequestBody Employee employee) {
		employeeService.updateEmployee(employee_id, employee);
	}
	
	@DeleteMapping(path="/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
	}
	
	@DeleteMapping(path="/deleteEmployee/{employee_id}")
	public void deleteEmployeeById(@PathVariable ObjectId employee_id) {
		employeeService.deleteEmployeeById(employee_id);
	}
}
