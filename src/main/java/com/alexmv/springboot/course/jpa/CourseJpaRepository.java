package com.alexmv.springboot.course.jpa;

import com.alexmv.springboot.course.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insertCourse(Course course){
        entityManager.merge(course);
    }

    public void deleteCourse(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findCourseById(long id){
        return entityManager.find(Course.class, id);
    }
}
