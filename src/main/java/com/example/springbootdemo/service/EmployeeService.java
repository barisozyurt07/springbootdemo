package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.EmployeeDao;
import com.example.springbootdemo.dao.IEmployeeDao;
import com.example.springbootdemo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    private final IEmployeeDao employeeDao;

    @Autowired
    public EmployeeService(IEmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public String saveEmployee(Employee employee) {
        Employee e = employeeDao.save(employee);

        return Long.toString(e.getId());
    }
}
