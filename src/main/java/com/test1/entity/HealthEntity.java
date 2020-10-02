package com.test1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="health_Insurance")
public class HealthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private  String healthInsuranceSchemeName;

    private int coverageAmount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private EmployeeEntity empid;



}
