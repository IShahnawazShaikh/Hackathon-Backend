package com.btalent.service.serviceimpl;

import com.btalent.models.EmployeeEntity;
import com.btalent.repository.EmployeeRepository;
import com.btalent.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeEntity loginUser(String empId) {
          Optional<EmployeeEntity> optionalEmployeeEntity=employeeRepository.findByEmail(empId);
          if(optionalEmployeeEntity.isPresent()){
              return optionalEmployeeEntity.get();
          }
          return null;
    }
}
