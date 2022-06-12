package com.btalent.controller;

import com.btalent.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
        public ResponseEntity loginUser(@RequestParam String email){
        var responseEmployeeEntity=employeeService.loginUser(email);

        if(responseEmployeeEntity!=null){
            return new ResponseEntity(responseEmployeeEntity, HttpStatus.OK);
        }
        return new ResponseEntity("User Not Found", HttpStatus.NOT_FOUND);
    }

}
