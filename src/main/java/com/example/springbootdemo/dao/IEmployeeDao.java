package com.example.springbootdemo.dao;

import com.example.springbootdemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Long> {
}
