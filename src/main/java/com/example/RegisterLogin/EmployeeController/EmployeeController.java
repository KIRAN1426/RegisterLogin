package com.example.RegisterLogin.EmployeeController;
import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Entity.LoginDTO;
import com.example.RegisterLogin.Service.EmployeeIMPL;
import com.example.RegisterLogin.Service.EmployeeService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping ("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeIMPL employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody Employee employee) {

        String id = employeeService.addEmployee(employee);
        return id;

    }

    @GetMapping("/welcome")
    public String Welcome() {

        return "Welcome";
    }


    @PostMapping(path = "/save")
    public ResponseEntity<?> loginEmployee(@RequestBody Employee loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        {
            return ResponseEntity.ok(loginResponse);
        }



    }
}

