package com.korit.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {
    Optional<DepartmentEntity> findByDepartmentName(String departmentName);
}
