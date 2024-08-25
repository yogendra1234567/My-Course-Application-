package com.restapi.restapi.entitie;

public class Course {

	private long id;
	private String topic;
	private String detail;
	public Course(long id, String topic, String detail) {
		super();
		this.id = id;
		this.topic = topic;
		this.detail = detail;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", topic=" + topic + ", detail=" + detail + ", getId()=" + getId() + ", getTopic()="
				+ getTopic() + ", getDetail()=" + getDetail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
