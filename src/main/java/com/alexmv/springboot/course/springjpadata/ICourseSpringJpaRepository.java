package com.alexmv.springboot.course.springjpadata;


import com.alexmv.springboot.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseSpringJpaRepository extends JpaRepository<Course, Long> {

}
