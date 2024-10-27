package com.example.Spring_Data_MongoDB.controller;

import com.example.Spring_Data_MongoDB.entity.EmployeeDetails;
import com.example.Spring_Data_MongoDB.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("Employee")
public class EmployeeController {

    EmployeeService employeeService;

    @PostMapping("index.page")
    public ResponseEntity<EmployeeDetails> createEmployee(@RequestBody EmployeeDetails employeeDetails) {
        employeeService.createEmployee(employeeDetails);
        return new ResponseEntity<>(employeeDetails, HttpStatus.CREATED);
    }

    @GetMapping("displayAll")
    public ResponseEntity<List<EmployeeDetails>> displayAllEmployee() {
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("display/{employeeId}")
    public ResponseEntity<EmployeeDetails> displayEmployeeById(@PathVariable("employeeId")  Long id) {
        return new ResponseEntity<>(employeeService.getEmployeeId(id), HttpStatus.OK);
    }



}
