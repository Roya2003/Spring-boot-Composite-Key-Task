package com.example.composite.key.service;

import com.example.composite.key.dto.EmployeeDto;
import com.example.composite.key.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

   List<?> getEmployee();

    ResponseEntity<?>SaveAll(EmployeeDto employeeDto);

}
