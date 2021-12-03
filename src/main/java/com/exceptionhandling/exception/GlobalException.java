package com.exceptionhandling.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	// To Handle NullPointerException
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException() {

		return "exception";
	}

	// To Handle AllExceptions
	@ExceptionHandler(value = Exception.class)
	public String handleAllException() {

		return "exception";
	}

}
