package com.alexmv.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alexmv.springboot.course.springjpadata.ICourseSpringJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
    //CourseJdbcRepository repository;

    //@Autowired
    //CourseJpaRepository repository;

    @Autowired
    ICourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        /*// PARA JDBC Y JPA NORMAL
        repository.insertCourse(new Course(1,"My first course", "Alex"));
        repository.insertCourse(new Course(2,"My second course", "Mengual"));
        repository.insertCourse(new Course(3,"My third course", "Vega"));

        repository.deleteCourse(1);

        System.out.println(repository.findCourseById(2));
        System.out.println(repository.findCourseById(3));*/

        // PARA SPRING DATA JPA
        repository.save(new Course(1,"My first course", "Alex"));
        repository.save(new Course(2,"My second course", "Mengual"));
        repository.save(new Course(3,"My third course", "Vega"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        
        System.out.println(repository.findByAuthor("Mengual"));
        
        System.out.println(repository.findByText("My third course"));


    }
}
