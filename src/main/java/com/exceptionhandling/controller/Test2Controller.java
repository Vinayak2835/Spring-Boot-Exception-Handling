package com.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exceptionhandling.model.WebSiteInfoDTO;

@Controller
public class Test2Controller {
	
	@RequestMapping("/testing2")
	public String getWebSiteInfo(@ModelAttribute("websiteinfodto") WebSiteInfoDTO webSiteInfoDTO) {
		
		System.out.println(webSiteInfoDTO);
		
		return "index";
	}

}
