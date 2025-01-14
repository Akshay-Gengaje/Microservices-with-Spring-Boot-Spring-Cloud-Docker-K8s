package com.akshay.rest_webservices.service;

import com.akshay.rest_webservices.error.EmployeeNotFoundException;
import com.akshay.rest_webservices.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmailId().isEmpty())
            employee.setEmployeeId(UUID.randomUUID().toString());
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with id" +id));
    }

    @Override
    public String deleteEmployeeById(String id) {

        Employee employee =  employees.stream()
                .filter(e -> e.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
                .get();

        return "Employee deleted with the id : " + id;
    }
}
