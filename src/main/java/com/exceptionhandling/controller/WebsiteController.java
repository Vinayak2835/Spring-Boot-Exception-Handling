package com.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.exceptionhandling.model.WebSiteInfoDTO;


@Controller
@ControllerAdvice(assignableTypes=TestController.class)
public class WebsiteController {
	
	@ModelAttribute("websiteinfodto")
	public WebSiteInfoDTO getWebSiteDTO() {
		
		WebSiteInfoDTO webSiteInfoDTO = new WebSiteInfoDTO();
		
		webSiteInfoDTO.setWebSiteCategory("Bus Booking");
		webSiteInfoDTO.setWebSiteName("Vinayakexpress.com");
		
		return webSiteInfoDTO;
	}
	
	@GetMapping("/show")
	public String showWebSiteDTO(@ModelAttribute("websiteinfodto") WebSiteInfoDTO webSiteInfoDTO) {
		
		System.out.println(webSiteInfoDTO);
		
		return "index";
	}

}
