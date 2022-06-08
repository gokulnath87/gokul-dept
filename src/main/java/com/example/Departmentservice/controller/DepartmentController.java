package com.example.Departmentservice.controller;

import com.example.Departmentservice.service.DepartmentService;
import com.example.Departmentservice.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/depp")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findByDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.findByDepartmentById(departmentId);
    }
   @GetMapping("/getdepp")
    public List<Department> getDeppy(){
        return  departmentService.getDeppy();
   }

}
