package com.restapi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.entitie.Course;
import com.restapi.restapi.services.CourseService;

@RestController 
public class MyController {
	@Autowired
	private CourseService  CourseSerivice;
	@GetMapping("/home")
 public String home() {
	 return "Welcome my beautifull courese";
 }
	//get the courses
	@GetMapping("/Courses") 
	public List<Course> getCourses()
	{
	return this.CourseSerivice.getCourses();
	}
	@GetMapping("/Courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.CourseSerivice.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public List<Course> addCourse(@RequestBody Course course) {
		  
		return this.CourseSerivice.addCourse(course);
	}
}
