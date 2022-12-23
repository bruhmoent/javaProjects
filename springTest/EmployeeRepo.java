package com.example.demop;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByUsername(String username);
}
