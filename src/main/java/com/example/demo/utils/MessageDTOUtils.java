package com.example.demo.utils;

import com.example.demo.dto.MessageDTO;
import com.example.demo.entities.Contact;

public class MessageDTOUtils {
	
	public static MessageDTO creationMessage(Contact createdUser){
		return returnMessage(createdUser, "created");
	}
	
	public static MessageDTO returnMessage (Contact updateContact, String action) {
		//retorna o nome do contato
		String createdContactName = updateContact.getName();
		//retorna o id do contato
		Long createdId = updateContact.getId();
		String createdContactMessage = String.format("Contact %s with Id %s successfully %s", createdContactName, createdId, action);
		
		//retornar MessageDTO.builder.message().build();
		return null;
	}

}
