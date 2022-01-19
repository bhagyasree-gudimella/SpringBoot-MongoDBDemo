package com.lavanya.gudimella.SpringBootMongoDBDemo.service;

import java.util.List; 
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanya.gudimella.SpringBootMongoDBDemo.model.Employee;
import com.lavanya.gudimella.SpringBootMongoDBDemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.insert(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> getEmployee(ObjectId employee_id) {
		return employeeRepository.findById(employee_id);
	}

	@Override
	public void updateEmployee(ObjectId employee_id, Employee employee) {
		Optional<Employee> employeeOptional = employeeRepository.findById(employee_id);
		if(employeeOptional.isPresent()) {
			employeeOptional.ifPresent(emp -> {
				emp.setEmployee_id(employee_id);
				emp.setEmail(employee.getEmail());
				employeeRepository.save(emp);
			});
		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	public void deleteEmployeeById(ObjectId employee_id) {
		employeeRepository.deleteById(employee_id);
	}
}
