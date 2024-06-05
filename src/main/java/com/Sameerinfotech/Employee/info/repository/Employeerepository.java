package com.Sameerinfotech.Employee.info.repository;

import com.Sameerinfotech.Employee.info.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee,Integer> {
}
