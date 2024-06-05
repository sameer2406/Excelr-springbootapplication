package com.Sameerinfotech.Employee.info.service;

import com.Sameerinfotech.Employee.info.model.Employee;
import com.Sameerinfotech.Employee.info.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;

    public Employee addemployee(Employee employee) {
        return repo.save(employee);
    }
}
