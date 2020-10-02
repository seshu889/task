package com.test1.serviceimpl;

import com.test1.dao.employeeDao;
import com.test1.entity.EmployeeEntity;
import com.test1.entity.Game;
import com.test1.requestmodel.GaneRequesModel;
import com.test1.service.employeeI;
import com.test1.service.gameI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GamesImpl implements gameI {
@Autowired
employeeDao employeedao;
    @Override
@Transactional(propagation = Propagation.REQUIRED)
    public void savegames(GaneRequesModel model) {
        Game games=new Game();
        EmployeeEntity emp=new EmployeeEntity();
        games.setGamename("cricket");
        games.setEmpid(emp);
employeedao.savegames(games);
    }
}
