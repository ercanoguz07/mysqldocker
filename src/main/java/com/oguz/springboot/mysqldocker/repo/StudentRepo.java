package com.oguz.springboot.mysqldocker.repo;

import com.oguz.springboot.mysqldocker.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
