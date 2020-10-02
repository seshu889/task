package com.test1.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmployeeEntity {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String name;
    private String designation;
    private double salary;
}
