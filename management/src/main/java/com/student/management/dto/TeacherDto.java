package com.student.management.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TeacherDto {

	Long id;
	
	String teacherName;
	
	List<String> subjectNames;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<String> getSubjectNames() {
		return subjectNames;
	}

	public void setSubjectNames(List<String> subjectNames) {
		this.subjectNames = subjectNames;
	}
	
}
