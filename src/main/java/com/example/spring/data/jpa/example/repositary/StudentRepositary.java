package com.example.spring.data.jpa.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.data.jpa.example.entity.Student;

@Repository //By using this Spring will understand this is Repositary Interface
public interface StudentRepositary extends JpaRepository<Student, Long> {

}
