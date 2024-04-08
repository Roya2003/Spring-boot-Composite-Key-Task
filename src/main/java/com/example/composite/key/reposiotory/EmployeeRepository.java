package com.example.composite.key.reposiotory;

import com.example.composite.key.entity.EmployeeEntity;
import com.example.composite.key.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, EmployeePKId> {
}
