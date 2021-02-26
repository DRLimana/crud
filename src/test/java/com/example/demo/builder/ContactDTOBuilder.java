package com.example.demo.builder;

import com.example.demo.dto.ContactDTO;

import lombok.Builder;

@Builder
public class ContactDTOBuilder {
	
	@Builder.Default
	private Long id = 1L;
	
	@Builder.Default
	private String name = "Daniel Teste";
	
	@Builder.Default
	private String email = "danielteste@teste.com";
	
	@Builder.Default
	private String phone = "11223344";
	
	public ContactDTO buildContactDTO() {
		return new ContactDTO(id,
				name,
				email,
				phone
				);
				
	}

}
