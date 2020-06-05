package com.sk.helloboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.helloboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
