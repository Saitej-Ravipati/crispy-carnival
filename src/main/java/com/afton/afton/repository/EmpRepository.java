package com.afton.afton.repository;

import com.afton.afton.empcollection.EmpEntity;
import com.afton.afton.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends MongoRepository<EmpEntity,String> {
}
