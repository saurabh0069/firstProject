package com.school.tutionfees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.tutionfees.dto.CourseDetailsRequestDto;
import com.school.tutionfees.dto.PriceDetailsResponseDto;


@RestController
@RequestMapping("/tutionFees")
public class TutionFeesController {
	
	@GetMapping("/fees")
	public Integer getTutionFees() {
		Integer tutionFees = 10000;
		return tutionFees;
	}
	
	
	@PostMapping("/course-price-details")
	public PriceDetailsResponseDto getCoursePriceDetails(@RequestBody  CourseDetailsRequestDto courseDetaislList) {
		PriceDetailsResponseDto priceDetails = new PriceDetailsResponseDto();
		//calculate total price - vijay
		//caluclate voucher or coupoun available - if the total price is more than 5000 coupoun available - saurabh
		//calculate payment options -  if totalprice is in the range of 2000- 5000 Gpay - mallikarjun
		//if price is between 5000-1000 paytm and credit card
		//set all the abouve values to pricedetails - dileep
		
		//steps to push for existing project
		//take latest of ur project
		//git add filename or git add .
		//git commit -m "price details changes"
		//git push
		
	
		return priceDetails;
	}
	
	
	
}
