package com.afton.afton.controller;

import com.afton.afton.empcollection.EmpEntity;
import com.afton.afton.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/newemployee")
    public void createEmployee(@RequestBody EmpEntity empEntity){
       employeeService.createEmployee(empEntity);
    }

    @GetMapping("/getemployee/{id}")
    public Optional<EmpEntity> getEmployee(@PathVariable String id) {
       return employeeService.getEmployee(id);

    }

    @DeleteMapping("/deleteemployee/{id}")
    public Boolean deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployee(id);
    }

}
