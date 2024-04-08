package com.example.composite.key.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

    private Long employee_Id;

    private Long dept_Id;

    private String name;

    private String emailId;

    private String address;

    private String companyName;
}
