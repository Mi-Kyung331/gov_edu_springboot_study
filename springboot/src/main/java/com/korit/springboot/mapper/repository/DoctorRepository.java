package com.korit.springboot.mapper.repository;


import com.korit.springboot.controller.domain.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {



}
