package com.example.entities;

import java.util.List;

import javax.persistence.OneToOne;

public class courseMaterial {
	@OneToOne
	private course course;
	
	private long id;
	private String url;
	
	public courseMaterial(com.example.entities.course course, long id, String url) {
		super();
		this.course = course;
		this.id = id;
		this.url = url;
	}
	
	public course getCourse() {
		return course;
	}
	
	public void setCourse(course course) {
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
}
