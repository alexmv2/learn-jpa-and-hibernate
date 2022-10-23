package com.alexmv.springboot.course.springjpadata;


import com.alexmv.springboot.course.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseSpringJpaRepository extends JpaRepository<Course, Long> {
	
	//findBy nombre del atributo de la entity
	public List<Course> findByAuthor(String author);
	
	public List<Course> findByText(String text);

}
