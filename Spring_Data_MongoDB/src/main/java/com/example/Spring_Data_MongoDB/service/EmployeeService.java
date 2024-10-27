package com.example.Spring_Data_MongoDB.service;

import com.example.Spring_Data_MongoDB.entity.EmployeeDetails;

import java.util.List;

public interface EmployeeService {

    EmployeeDetails createEmployee(EmployeeDetails employeeDetails);

    List<EmployeeDetails> getAllEmployee ();

    EmployeeDetails getEmployeeId(Long id);

//    EmployeeDetails updateEmployee(Long id, EmployeeDetails employeeDetails);
//
//    void deleteEmployee(Long id);

}
