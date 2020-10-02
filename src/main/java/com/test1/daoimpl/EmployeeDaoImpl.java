package com.test1.daoimpl;

import com.test1.dao.employeeDao;
import com.test1.entity.EmployeeEntity;
import com.test1.entity.Game;
import com.test1.entity.HealthEntity;
import com.test1.repository.employeeRepository;
import com.test1.repository.gameRepository;
import com.test1.repository.healthrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements employeeDao {
    @Autowired
    employeeRepository employeerepository;

@Autowired
healthrepository repo;

@Autowired
gameRepository gamerepo;

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity emp) {

        return employeerepository.save(emp);
    }

    @Override
    public List<EmployeeEntity> getallemployees() {
        return (List<EmployeeEntity>)employeerepository.findAll();
    }

    @Override
    public void deleteEmployeebyId(int empid) {
        employeerepository.deleteById(empid);
    }

    @Override
    public HealthEntity savehealth(HealthEntity health) {
        return repo.save(health);
    }

    @Override
    public void savegames(Game games) {
        gamerepo.save(games);
    }
}
