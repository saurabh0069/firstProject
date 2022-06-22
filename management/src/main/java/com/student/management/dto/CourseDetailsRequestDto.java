package com.student.management.dto;

import java.util.List;

public class CourseDetailsRequestDto {
private List<CourseDetailsDto> courseDetails;

public List<CourseDetailsDto> getCourseDetails() {
	return courseDetails;
}

public void setCourseDetails(List<CourseDetailsDto> courseDetails) {
	this.courseDetails = courseDetails;
}


}
