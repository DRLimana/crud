package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageDTO {

	private String message;

	public MessageDTO() {
	}
	
	public MessageDTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
