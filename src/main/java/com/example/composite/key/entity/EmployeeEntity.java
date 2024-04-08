package com.example.composite.key.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_table")

public class EmployeeEntity {

    @EmbeddedId
    private EmployeePKId employeePKId;

    private String name;

    private String emailId;

    private String address;

    private String companyName;


}
