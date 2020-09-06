package com.army.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("gallery")
	public String gallery() {
		return "gallery";
	}
	
	@GetMapping("newGallery")
	public String galleryNew() {
		return "newGallery";
	}
	
	@GetMapping("armyEligibility")
	public String armyEligibilityPage() {
		return "armyEligibility";
	}
	
	@GetMapping("policeEligibility")
	public String policeEligibilityPage() {
		return "policeEligibility";
	}

}
