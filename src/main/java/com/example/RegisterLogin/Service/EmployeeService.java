package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Entity.LoginDTO;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public interface EmployeeService {

    String addEmployee(Employee employee);

    LoginResponse loginEmployee(Employee loginDTO);

//    LoginResponse loginResponse(LoginDTO loginDTO);
}


