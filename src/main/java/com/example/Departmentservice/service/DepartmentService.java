package com.example.Departmentservice.service;

import com.example.Departmentservice.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
     Department saveDepartment(Department department);

    Department findByDepartmentById(Long departmentId);

    List<Department> getDeppy();
}
