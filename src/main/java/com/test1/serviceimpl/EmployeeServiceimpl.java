package com.test1.serviceimpl;

import com.sun.istack.internal.NotNull;
import com.test1.dao.employeeDao;
import com.test1.entity.EmployeeEntity;
import com.test1.entity.HealthEntity;
import com.test1.requestmodel.EmployeeRequest;
import com.test1.requestmodel.GaneRequesModel;
import com.test1.service.employeeI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.mapping.AccessOptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.soap.Addressing;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RefreshScope
@Service
public class EmployeeServiceimpl implements employeeI {
    @Value("${app.dummy}")

    private String dummy;
    GaneRequesModel model=new GaneRequesModel();
    @Autowired
    GamesImpl impl;

@Autowired
employeeDao employeedao;

    Map<String,Object>response=new HashMap<>();



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ResponseEntity<Object> saveEmployee(EmployeeRequest request) {

        EmployeeEntity emp=new EmployeeEntity();

         HealthEntity health=new HealthEntity();

            emp.setName(request.getName());
            emp.setDesignation(request.getDesignation());
            emp.setSalary(request.getSalary());
        EmployeeEntity  emp1= employeedao.saveEmployee(emp);
//emp.setEmpId(10);
    health.setEmpid(emp);
   health.setHealthInsuranceSchemeName(request.getHealthInsuranceSchemeName());
   health.setCoverageAmount(request.getCoverageAmount());
        HealthEntity  health1=employeedao.savehealth(health);

        impl.savegames( model);

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

    @Override
    public void deleteEmployeebyId(int empid) {
        employeedao.deleteEmployeebyId(empid);
    }
}
