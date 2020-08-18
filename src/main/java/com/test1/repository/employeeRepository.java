package com.test1.repository;

import com.test1.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface employeeRepository extends CrudRepository<EmployeeEntity,Integer> {


}
