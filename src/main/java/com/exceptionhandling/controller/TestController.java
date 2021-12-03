package com.exceptionhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exceptionhandling.model.User;
import com.exceptionhandling.model.WebSiteInfoDTO;

@Controller
public class TestController {

	User user;

	@RequestMapping("/testing")
	public String getWebSiteInfo(@ModelAttribute("websiteinfodto") WebSiteInfoDTO webSiteInfoDTO) {

		// It will throw null pointer exception. because User user is not initialized.we
		// handled it inside the GlobalException class

		System.out.println(user.getFirstName());

		System.out.println(webSiteInfoDTO);

		return "index";
	}

}
