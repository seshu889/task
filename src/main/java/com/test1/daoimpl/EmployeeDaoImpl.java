package com.test1.daoimpl;

import com.test1.dao.employeeDao;
import com.test1.entity.EmployeeEntity;
import com.test1.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements employeeDao {
    @Autowired
    employeeRepository employeerepository;


    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity emp) {
        return employeerepository.save(emp);
    }

    @Override
    public List<EmployeeEntity> getallemployees() {
        return (List<EmployeeEntity>)employeerepository.findAll();
    }
}
