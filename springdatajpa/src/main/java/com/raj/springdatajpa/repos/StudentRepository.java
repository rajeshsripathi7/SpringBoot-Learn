package com.raj.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.springdatajpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
