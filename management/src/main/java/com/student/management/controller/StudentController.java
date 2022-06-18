package com.student.management.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.management.entities.StudentEntity;
import com.student.management.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String notificationMsg() {
		System.out.println("welcome msg");
		return "Hello Students Welcome!!!";
	}

	@GetMapping("/welcome-message")
	public String welcomeMessage() {
		System.out.println("welcome msg");
		return "Hello Students";
	}
	
	@GetMapping("/testing")
	public String testing() {
		System.out.println("welcome msg");
		return "Hello testing";
	}
	
	
	@PostMapping("/create-student")
	public void createStudent(@RequestBody StudentEntity student) {
		studentService.saveStudent(student);
	}
	
	@GetMapping("/fetch-students") 
	public List<StudentEntity> fetchStudents() {
		System.out.print("fetch students{}");
		return studentService.fetchStudents();
	}
	
	@PutMapping("/update-student")
	public void updateStudent(@RequestBody StudentEntity student) {
		studentService.updateStudent(student);
	}
	
	@PatchMapping("/update-student-patch/{id}")
	public void updateStudentPatch(@RequestBody StudentEntity student,@PathVariable Long id) {
		studentService.updateStudentPatch(student,id);
	}
	
	
	@DeleteMapping("delete-student")
	public void deleteStudent(@RequestBody StudentEntity student) {
			studentService.deleteStudent(student);
	}
	
	@GetMapping("/course-cost") 
	public String getCourseCost() {
		String url = "http://localhost:8085/tutionFees/fees";
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <String> entity = new HttpEntity<String>(headers);
		String tutionFees = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
		return tutionFees;
	}
}
