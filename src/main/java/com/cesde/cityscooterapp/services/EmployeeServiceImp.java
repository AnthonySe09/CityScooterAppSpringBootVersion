package com.cesde.cityscooterapp.services;


import com.cesde.cityscooterapp.domain.Employee;
import com.cesde.cityscooterapp.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService{
    EmployeeServiceImp (EmployeeRepository employeeRepository){
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }
}
