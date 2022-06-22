package com.student.management.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.management.dto.CourseDetailsRequestDto;
import com.student.management.dto.PriceDetailsResponseDto;

@RestController
@RequestMapping("/tution-fees")
public class TutionFeesController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/course-price")
	public PriceDetailsResponseDto getCoursePriceDetails(@RequestBody  CourseDetailsRequestDto courseDetaislList) {
		String url = "http://localhost:8085/tutionFees/course-price-details";
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <CourseDetailsRequestDto> entity = new HttpEntity<CourseDetailsRequestDto>(courseDetaislList,headers);
	    PriceDetailsResponseDto priceDetails = restTemplate.exchange(url, HttpMethod.POST, entity, PriceDetailsResponseDto.class).getBody();
		return priceDetails;
	}
}
