package com.example.springbootdemo;

import com.example.springbootdemo.domain.Employee;
import com.example.springbootdemo.service.EmployeeService;
import com.example.springbootdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private final  IEmployeeService employeeService;

    @Autowired
    public WebController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/saveemployee")
    public String saveEmployee(@RequestBody Employee employee){
        String s = employeeService.saveEmployee(employee);
        return s;
    }
}
