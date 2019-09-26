package com.waltermagni.workshopmongo.service.exception;

import org.springframework.beans.factory.annotation.Autowired;

import com.waltermagni.workshopmongo.repository.UserRepository;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserRepository repo;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
}
