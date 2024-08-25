package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.restapi.entitie.Course;
@Service
public class CourseServiceImpl implements CourseService {
 List<Course> list;

 public CourseServiceImpl(){
	 list=new ArrayList<>();
	 list.add(new Course(145, "Java Core Course","the course containt of basic java"));
	 list.add(new Course(3422, "Web Developer Course","Creating the website"));
 }
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public List<Course> addCourse(Course course) {

	    System.out.println("These are few available courses -->" + course);
		list.add(course);
		System.out.println("Current List items -->" + list);
		return list;
	}

}
