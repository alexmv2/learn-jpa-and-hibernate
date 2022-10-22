package com.alexmv.springboot.course.jdbc;

import com.alexmv.springboot.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_QUERY =
        """
            INSERT INTO COURSE (id, text, author)
            VALUES(?, ?, ?)
        """;

    private static final String DELETE_QUERY =
        """
            DELETE FROM COURSE WHERE ID = ?
        """;

    private static final String SELECT_QUERY =
            """
                SELECT * FROM COURSE WHERE ID = ?
            """;


    public void insertCourse(Course course){
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getText(), course.getAuthor());
    }

    public void deleteCourse(long id){
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findCourseById(long id){
        return jdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }

}
