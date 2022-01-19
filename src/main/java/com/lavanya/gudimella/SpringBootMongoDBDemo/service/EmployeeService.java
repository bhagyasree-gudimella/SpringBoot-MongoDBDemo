package com.lavanya.gudimella.SpringBootMongoDBDemo.service; 

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.lavanya.gudimella.SpringBootMongoDBDemo.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Optional<Employee> getEmployee(ObjectId employee_id);

	public List<Employee> getAllEmployees();

	public void updateEmployee(ObjectId employee_id, Employee employee);

	public void deleteEmployee(Employee employee);

	public void deleteEmployeeById(ObjectId employee_id);
}
