package com.example.securityproject.repository;

import com.example.securityproject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

//    void save(Course course, Company company);
}