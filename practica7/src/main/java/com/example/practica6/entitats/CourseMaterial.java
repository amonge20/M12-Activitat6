package com.example.practica6.entitats;

import java.util.List;
import java.util.Optional;

import javax.persistence.OneToOne;

public class CourseMaterial {
	@OneToOne
	private Course course;
	
	private long id;
	private String url;
	
	public CourseMaterial(com.example.practica6.entitats.Course course, long id, String url) {
		super();
		this.course = course;
		this.id = id;
		this.url = url;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "courseMaterial [course=" + course + ", id=" + id + ", url=" + url + ", getCourse()=" + getCourse()
				+ ", getId()=" + getId() + ", getUrl()=" + getUrl() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public List<CourseMaterial> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<com.example.practica6.entitats.Course> findById(long id2) {
		// TODO Auto-generated method stub
		return null;
	}
}