package com.test1.repository;

import com.test1.entity.HealthEntity;
import org.springframework.data.repository.CrudRepository;

public interface healthrepository extends CrudRepository<HealthEntity,Integer> {

}
