package com.example.demo.repository;

import com.example.demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByNameLike(String name);


}
