package io.github.anantharajuc.sbtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.anantharajuc.sbtest.service.PostmanEchoServiceImpl;

@RestController
@RequestMapping("/api/postman-echo")
public class PostmanEchoController 
{
	@Autowired
	private PostmanEchoServiceImpl postmanEchoServiceImpl;
	
	@GetMapping(value="/GETrequest")
	public void getRequest()
	{
		postmanEchoServiceImpl.getRequest();
	}
	
	@GetMapping(value="/POSTrequest")
	public void postFormData()
	{
		postmanEchoServiceImpl.postFormData();
	}
}
