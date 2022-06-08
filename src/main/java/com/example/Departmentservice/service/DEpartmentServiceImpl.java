package com.example.Departmentservice.service;

import com.example.Departmentservice.repository.DepartmentRepo;
import com.example.Departmentservice.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DEpartmentServiceImpl implements DepartmentService {
  @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department findByDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).get();
       // return null;
    }

    @Override
    public List<Department> getDeppy() {
        return departmentRepo.findAll();
    }
}
