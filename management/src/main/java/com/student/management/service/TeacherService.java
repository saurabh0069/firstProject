package com.student.management.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.dto.TeacherDto;
import com.student.management.entities.TeacherEntity;
import com.student.management.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;

	public void saveTeacher(TeacherDto teacher) {
		TeacherEntity teacherEntity = convertDtoToEntity(teacher);
		Boolean eligible = calculateEligibility(teacher);
		if(eligible) {
		teacherRepository.save(teacherEntity);
		} else {
			System.out.println("Teacher is not eligible");
		}
	}
	
	
	private TeacherEntity convertDtoToEntity(TeacherDto teacherDto) {
		TeacherEntity teacherEntity = new TeacherEntity();
		teacherEntity.setTeacherName(teacherDto.getTeacherName());
		List<String> subjectNames  = teacherDto.getSubjectNames();
		StringBuilder sb = new StringBuilder();
		for(String subject:subjectNames) {
			sb.append(subject).append(" ");
		}
		teacherEntity.setSubjectNames(sb.toString());
		return teacherEntity;
	}
	
	private boolean  calculateEligibility(TeacherDto teacherDto) {
		//only if the teacher knows the subject - Maths -only then save the teacher
		boolean eligible = false;
		List<String> subjectNames = teacherDto.getSubjectNames();
		long count = subjectNames.stream().filter(eachSubject -> eachSubject.equals("Maths")).count();
		if(count>1) {
			eligible = true;
		}
		return eligible;
	}

}
