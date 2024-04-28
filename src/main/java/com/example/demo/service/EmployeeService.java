package com.example.demo.service;

import com.example.demo.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getEmployeeById(Integer id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee id);

    void deleteEmployeeById(Integer id);
}
