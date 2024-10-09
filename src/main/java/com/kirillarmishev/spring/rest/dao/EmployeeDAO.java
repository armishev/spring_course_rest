package com.kirillarmishev.spring.rest.dao;


import com.kirillarmishev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    public Employee getEmployee(int id);

}
