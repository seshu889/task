package com.test1.serviceimpl;

import com.test1.dao.employeeDao;
import com.test1.entity.EmployeeEntity;
import com.test1.requestmodel.EmployeeRequest;
import com.test1.service.employeeI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RefreshScope
@Service
public class EmployeeServiceimpl implements employeeI {
    @Value("${app.dummy}")
    private String dummy;

@Autowired
employeeDao employeedao;

    Map<String,Object>response=new HashMap<>();
    EmployeeEntity emp=new EmployeeEntity();


    @Override
    public ResponseEntity<Object> saveEmployee(EmployeeRequest request) {

            emp.setName(request.getName());
            emp.setDesignation(request.getDesignation());
            emp.setSalary(request.getSalary());
      emp= employeedao.saveEmployee(emp);

               response.put("status", "success");
        response.put("dummyValue", dummy);
               response.put("message", "employee creted successfully");
               return ResponseEntity.status(HttpStatus.CREATED).body(response);


    }

    @Override
    public ResponseEntity<Object> getallemployees() {

        List<EmployeeEntity> allemployees=employeedao.getallemployees();


                    response.put("status", "Success");
        response.put("dummyValue", dummy);
                    response.put("messge",allemployees);
             return ResponseEntity.status(HttpStatus.OK).body(response);



    }
}
