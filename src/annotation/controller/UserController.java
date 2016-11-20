package annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import annotation.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	public void execute(){
		System.out.println("UserController execute.....");
		service.add(); 
	}
}
