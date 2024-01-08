package com.example._02_crud_h2_jpa.repository;

import com.example._02_crud_h2_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
