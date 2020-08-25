package com.test1.controller;

import com.test1.entity.EmployeeEntity;
import com.test1.requestmodel.EmployeeRequest;

import com.test1.service.employeeI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller

@ComponentScan(basePackages = {"com.test1.*" })
@Component
@RestController
@RequestMapping("/api")
@RefreshScope

public class EmployeeController {


    @Autowired
    employeeI employeeservice;

    @PostMapping("/employees")
    public ResponseEntity<Object> saveEmployee(@RequestBody EmployeeRequest request){

      return  employeeservice.saveEmployee(request);

    }

    @GetMapping("/employees")
    public ResponseEntity<Object> getallemployees()
    {

        return  employeeservice.getallemployees();
    }
}




