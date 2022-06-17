package com.school.tutionfees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tutionFees")
public class TutionFeesController {
	
	@GetMapping("/fees")
	public Integer getTutionFees() {
		Integer tutionFees = 10000;
		return tutionFees;
	}

}
