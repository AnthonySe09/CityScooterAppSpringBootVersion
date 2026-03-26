package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);

}
