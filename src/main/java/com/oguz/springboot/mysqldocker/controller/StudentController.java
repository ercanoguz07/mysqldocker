package com.oguz.springboot.mysqldocker.controller;

import com.oguz.springboot.mysqldocker.entity.Student;
import com.oguz.springboot.mysqldocker.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/findAll")
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @PostMapping("/insert")
    public Student insert(@RequestBody Student student){
        return studentRepo.save(student);
    }
}
