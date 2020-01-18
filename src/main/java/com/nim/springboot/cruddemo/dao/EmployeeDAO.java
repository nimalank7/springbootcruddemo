package com.nim.springboot.cruddemo.dao;

import com.nim.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
