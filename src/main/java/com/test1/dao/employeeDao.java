package com.test1.dao;

import com.test1.entity.EmployeeEntity;

import java.util.List;

public interface employeeDao {


    EmployeeEntity saveEmployee(EmployeeEntity emp);

    List<EmployeeEntity> getallemployees();
}
