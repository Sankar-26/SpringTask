package com.example.Spring_Data_MongoDB.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("EmployeeDetails")
public class EmployeeDetails {

    @Id
    private long employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeLocation;


}
