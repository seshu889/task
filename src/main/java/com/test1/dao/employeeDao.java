package com.test1.dao;

import com.test1.entity.EmployeeEntity;
import com.test1.entity.Game;
import com.test1.entity.HealthEntity;

import java.util.List;

public interface employeeDao {


    EmployeeEntity saveEmployee(EmployeeEntity emp);

    List<EmployeeEntity> getallemployees();

    void deleteEmployeebyId(int empid);

    HealthEntity savehealth(HealthEntity health);

    void savegames(Game games);
}
