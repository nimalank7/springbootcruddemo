package com.nim.springboot.cruddemo.dao;

import com.nim.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="api")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
