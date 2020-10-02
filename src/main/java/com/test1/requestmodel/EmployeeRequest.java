package com.test1.requestmodel;

import lombok.Data;

@Data
public class EmployeeRequest {

        private String name;
    private String designation;
    private double salary;
    private  String healthInsuranceSchemeName;
    private int coverageAmount;

}
