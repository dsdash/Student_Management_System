package com.StudentsSystemManagement.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentsSystemManagement.entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {

}
