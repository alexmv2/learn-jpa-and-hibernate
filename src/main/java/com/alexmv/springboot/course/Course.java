package com.alexmv.springboot.course;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String text;
    private String author;

    public Course(){

    }

    public Course(long id, String text, String author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
