package com.afton.afton.service;

import com.afton.afton.empcollection.EmpEntity;

import java.util.Optional;


public interface EmployeeService {

    public Boolean createEmployee(EmpEntity empEntity);



public Boolean deleteEmployee(String id);


    Optional<EmpEntity> getEmployee(String id);
}
