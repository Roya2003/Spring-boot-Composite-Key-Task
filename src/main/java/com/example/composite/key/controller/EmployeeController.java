package com.example.composite.key.controller;

import com.example.composite.key.dto.EmployeeDto;
import com.example.composite.key.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mapping")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllData")
    List<?>GetallData(){
        return employeeService.getEmployee();
    }

    @PostMapping("/SaveAllData")
    ResponseEntity<?>SaveAllData(@RequestBody EmployeeDto employeeDto){
        return employeeService.SaveAll(employeeDto);

    }
}
