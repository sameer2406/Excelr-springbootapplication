package com.Sameerinfotech.Employee.info.controller;



import com.Sameerinfotech.Employee.info.model.Employee;
import com.Sameerinfotech.Employee.info.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {

    @Autowired
    private Employeeservice service;

    @PostMapping("/addemp")
    public Employee addemployee(@RequestBody Employee employee) {
        return service.addemployee(employee);
    }

}
