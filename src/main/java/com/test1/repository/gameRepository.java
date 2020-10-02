package com.test1.repository;

import com.test1.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface gameRepository extends CrudRepository<Game,Integer> {


}
