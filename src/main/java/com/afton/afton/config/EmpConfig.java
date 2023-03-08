package com.afton.afton.config;

import com.afton.afton.service.EmployeeService;
import com.afton.afton.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {

    @Bean
    public EmployeeService employeeService(){
return new EmployeeServiceImpl();
    }
}
