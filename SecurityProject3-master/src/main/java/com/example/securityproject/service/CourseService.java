package com.example.securityproject.service;

import com.example.securityproject.model.Course;
import com.example.securityproject.repository.CompanyRepository;
import com.example.securityproject.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository repository;
    private final CompanyRepository companyRepository;

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course saveCourse(Course course){
        Course course1 = mapToEntity(course);
        repository.save(course1);
        return course1;
    }

    public Course getByIdCourse(Long id) {
        return repository.findById(id).get();
    }

    public void deleteByIdCourse(Long id) {
        repository.deleteById(id);
    }

    public void updateCourse(Course course, Long id) {
        repository.getById(id);
        repository.save(course);
    }

    public Course mapToEntity(Course course){
        Course course1 = new Course();
        course1.setCourseName(course.getCourseName());
        course1.setDuration(course.getDuration());
        course1.setCompany(companyRepository.getById(course.getCompany().getId()));
        return course1;
    }
}
