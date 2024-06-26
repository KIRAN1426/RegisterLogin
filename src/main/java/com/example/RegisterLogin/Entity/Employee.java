package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class Employee {


    @Id
    @Column(name = "employee_id" , length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;

    @Column(name = "employee_name" , length = 255)
    private  String employeename;

    @Column(name = "email" , length = 255)
    private String email;

    @Column(name = "password" , length = 255)
    private String password;


    }


