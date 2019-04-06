package com.YLYLO.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.YLYLO.models.UserModel;

@RestController
@RequestMapping(path="/user") 
public class UserController {

	@RequestMapping(path="/new", method=RequestMethod.POST)
	public @ResponseBody String saveUser(@RequestBody UserModel userModel) {
	
		return "";
	}
}
