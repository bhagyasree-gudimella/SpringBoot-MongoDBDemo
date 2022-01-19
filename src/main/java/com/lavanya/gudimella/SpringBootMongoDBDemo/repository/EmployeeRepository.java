package com.lavanya.gudimella.SpringBootMongoDBDemo.repository;

import org.bson.types.ObjectId; 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lavanya.gudimella.SpringBootMongoDBDemo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {

}
