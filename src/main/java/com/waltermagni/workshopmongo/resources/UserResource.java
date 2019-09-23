package com.waltermagni.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waltermagni.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>>findAll(){
		User walter = new User("1", "Walter", "waltermagni@terra.com.br");
		User jose = new User("1", "jose", "jose@terra.com.br");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(walter, jose));
		return ResponseEntity.ok().body(list);
	}
	
}
