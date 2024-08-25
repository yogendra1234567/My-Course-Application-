package com.restapi.restapi.services;

import java.util.List;

import com.restapi.restapi.entitie.Course;

public interface CourseService {
public List<Course> getCourses();
public Course getCourse(long courseId);
public List<Course> addCourse(Course course);
}
