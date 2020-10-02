package com.test1.controller;

import com.test1.requestmodel.EmployeeRequest;

import com.test1.requestmodel.GaneRequesModel;
import com.test1.service.employeeI;
import com.test1.service.gameI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

@ComponentScan(basePackages = {"com.test1.*" })
@Component
@RestController
@RequestMapping("/api")
@RefreshScope

public class EmployeeController {


    @Autowired
    employeeI employeeservice;

@Autowired
gameI gamei;

    @PostMapping("/employees")
    public ResponseEntity<Object> saveEmployee(@RequestBody EmployeeRequest request){

      return  employeeservice.saveEmployee(request);

    }

    @GetMapping("/employees")
    public ResponseEntity<Object> getallemployees()
    {

        return  employeeservice.getallemployees();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeebyId(@PathVariable int empid)
    {
        employeeservice.deleteEmployeebyId(empid);
    }

@PostMapping("/games")
public void savegames(@RequestBody GaneRequesModel model)
{
    gamei.savegames(model);
}

}




