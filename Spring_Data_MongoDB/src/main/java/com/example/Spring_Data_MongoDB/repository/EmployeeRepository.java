package com.example.Spring_Data_MongoDB.repository;

import com.example.Spring_Data_MongoDB.entity.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeDetails,Long> {
}
