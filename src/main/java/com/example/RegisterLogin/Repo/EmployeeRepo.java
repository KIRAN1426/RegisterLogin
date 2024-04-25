package com.example.RegisterLogin.Repo;

import com.example.RegisterLogin.Entity.Employee;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableAutoConfiguration
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Optional<Employee> findOneByEmailAndPassword (String email, String password);

    Employee findByEmail(String email);
}
