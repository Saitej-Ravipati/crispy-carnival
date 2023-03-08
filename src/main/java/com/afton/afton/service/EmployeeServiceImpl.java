package com.afton.afton.service;

import com.afton.afton.empcollection.EmpEntity;
import com.afton.afton.repository.EmpRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Optional;


public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmpRepository empRepository;


    @Override
    public Boolean createEmployee(EmpEntity empEntity) {
        EmpEntity entity = new EmpEntity();
     entity.setCreatedDate(new Date());
     entity.setCreatedBy("sai");
empRepository.save(empEntity);

        return null;
    }

    @Override
    public Boolean deleteEmployee(String id) {
        empRepository.deleteById(id);
        return true;
    }

    @Override
    public Optional<EmpEntity> getEmployee(String id) {
        return empRepository.findById(id);

    }


}
