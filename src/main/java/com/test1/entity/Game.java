package com.test1.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Game {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int gameId;
private String gamename;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private EmployeeEntity empid;
}
