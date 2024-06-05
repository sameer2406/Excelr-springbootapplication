package com.Sameerinfotech.Employee.info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    public int id;
    public String name;
    public String department;
    public String designation;
    public String email;
    public String address;
    public String phone;
    public String salary;
}
