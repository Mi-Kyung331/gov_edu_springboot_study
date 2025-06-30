package com.korit.springboot.repository;

import com.korit.springboot.controller.domain.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    void deleteById(Integer id);

    Boolean removeById(Integer id);
}