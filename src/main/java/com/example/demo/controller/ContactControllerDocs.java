package com.example.demo.controller;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.Contact;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
public interface ContactControllerDocs {
	
	@ApiOperation(value = "Contact creation operation")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Success contact creation"),
			@ApiResponse(code = 400, message = "Missing required field, or an error on validation field rules"),
	})
	Contact create(Contact contact);
	
	@ApiOperation(value = "Contact creation operation")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success email found"),
			@ApiResponse(code = 404, message = "Email not found"),
	})
	ResponseEntity<Contact> findByEmail(String email);
}
