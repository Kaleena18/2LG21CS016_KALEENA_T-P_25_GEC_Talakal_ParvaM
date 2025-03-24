package com.example.studentcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.controller.KaleenaEmployeeController;
import com.example.studentcrud.model.Employee;

public interface KaleenaEmployeeRepository extends JpaRepository<Employee, Long>  {
    void save(KaleenaEmployeeController emp);
}
