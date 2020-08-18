package com.test1.service;

import com.test1.entity.EmployeeEntity;
import com.test1.requestmodel.EmployeeRequest;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface employeeI {


    ResponseEntity<Object>  saveEmployee(EmployeeRequest request);

    ResponseEntity<Object> getallemployees();

}
