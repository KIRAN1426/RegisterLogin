package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Repo.EmployeeRepo;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    private PasswordEncoder passwordEncoder;

    @Override
    public String addEmployee(Employee employeecurrent) {
        Employee employee = new Employee(

                employeecurrent.getEmployeeid(),
                employeecurrent.getEmployeename(),
                employeecurrent.getEmail(),
                this.passwordEncoder.encode(employeecurrent.getPassword())
        );

        employeeRepo.save(employee);
        return employee.getEmployeename();
    }


    @Override
    public LoginResponse loginEmployee(Employee loginDTO) {
        String msg = "";
        Employee employee1 = employeeRepo.findByEmail(loginDTO.getEmail());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodePassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodePassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodePassword);

                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {

                    return new LoginResponse("Email not Exist", false);
                }
            } else {
                return new LoginResponse("Email not exits", false);
            }
        }
        return new LoginResponse("Null", false);


    }
}




