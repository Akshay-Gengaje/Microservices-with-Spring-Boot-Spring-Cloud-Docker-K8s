package com.akshay.rest_webservices.controller;

import com.akshay.rest_webservices.model.Employee;
import com.akshay.rest_webservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/employee")
public class EmployeeV2Controller {
    @Autowired
    @Qualifier("employeeV2Service")
    private EmployeeService employeeService;
    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
}
