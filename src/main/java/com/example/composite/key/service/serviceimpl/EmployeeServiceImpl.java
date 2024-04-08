package com.example.composite.key.service.serviceimpl;
import com.example.composite.key.apiresponce.ApiResponce;
import com.example.composite.key.dto.EmployeeDto;
import com.example.composite.key.entity.EmployeeEntity;
import com.example.composite.key.entity.EmployeePKId;
import com.example.composite.key.reposiotory.EmployeeRepository;
import com.example.composite.key.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<?> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public ResponseEntity<?> SaveAll(EmployeeDto employeeDto) {
        ApiResponce responce = new ApiResponce();
        EmployeeEntity entities = new EmployeeEntity();
        EmployeePKId EmployeePk = new EmployeePKId();

        entities.setName(employeeDto.getName());
        entities.setAddress(employeeDto.getAddress());
        entities.setEmailId(employeeDto.getEmailId());
        entities.setCompanyName(employeeDto.getCompanyName());


        EmployeePk.setEmployee_Id(employeeDto.getEmployee_Id());
        EmployeePk.setDept_Id(employeeDto.getDept_Id());
        entities.setEmployeePKId(EmployeePk);


        responce.setMessage("Employee Data Added");
        responce.setResult(entities);

        employeeRepository.save(entities);

        return ResponseEntity.ok(responce) ;
    }
}
