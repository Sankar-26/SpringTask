package com.example.Spring_Data_MongoDB.service.impl;


import com.example.Spring_Data_MongoDB.entity.EmployeeDetails;
import com.example.Spring_Data_MongoDB.repository.EmployeeRepository;
import com.example.Spring_Data_MongoDB.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDetails createEmployee(EmployeeDetails employeeDetails) {
       return employeeRepository.save(employeeDetails);
    }

    @Override
    public List<EmployeeDetails> getAllEmployee() {
        List<EmployeeDetails> employeeDetailsList = employeeRepository.findAll();
        return employeeDetailsList;
    }

    @Override
    public EmployeeDetails getEmployeeId(Long id) {
        EmployeeDetails selectedEmployee = employeeRepository.findById(id).get();
        return selectedEmployee;
    }
}
