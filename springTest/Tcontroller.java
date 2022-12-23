package com.example.demop;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tcontroller {

    private final EmployeeRepo employeeRep;

    public Tcontroller(com.example.demop.EmployeeRepo employeeRep) {
        this.employeeRep = employeeRep;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return employeeRep.findAll();
    }

    @GetMapping("/employee")
    List<Employee> alll(String user) {
        return employeeRep.findByUsername(user);
    }

    @GetMapping("/employe")
    Employee add(String user, String password) {
        Employee at = new Employee();
        at.setUsername(user);
        at.setPassword(password);
        return employeeRep.save(at);
    }
}
