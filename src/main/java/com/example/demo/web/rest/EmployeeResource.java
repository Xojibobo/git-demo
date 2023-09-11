package com.example.demo.web.rest;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;
    @PutMapping("/employees")
    public ResponseEntity update(@RequestBody Employee employee){
        Employee e1 = employeeService.save(employee);
        return ResponseEntity.ok("Success");
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity delete(@PathVariable Long id){
employeeService.delete(id);
return ResponseEntity.ok("User deleted");
    }
}
