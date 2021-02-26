package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contact;
import com.example.demo.repository.ContactRepository;

@RestController
@RequestMapping(value = "/contacts")
public class ContactController implements ContactControllerDocs{
	
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping()
	public ResponseEntity<List<Contact>> findAll(){
		return ResponseEntity.ok().body(contactRepository.findAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Contact> findById(@PathVariable Long id){
		Contact obj = contactRepository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/search")
	@ResponseStatus(code = HttpStatus.FOUND)
	public ResponseEntity<Contact> findByEmail(@RequestParam String email){
		Contact obj = contactRepository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Contact create(@RequestBody Contact contact){
	   return contactRepository.save(contact);
	}
}
