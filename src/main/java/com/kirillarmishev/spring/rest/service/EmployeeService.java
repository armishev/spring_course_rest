package com.kirillarmishev.spring.rest.service;


import com.kirillarmishev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Employee employee);

    public Employee getEmployee(int id);

}

