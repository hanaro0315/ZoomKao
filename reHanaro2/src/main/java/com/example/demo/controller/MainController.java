package com.example.demo.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Dto.Member;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired
	private MemberService member;

	@RequestMapping(value="/")
	public String home() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(HttpServletRequest request) {
		return "login";
	}
	
	@PostMapping(value="/signUp")
	public String signUp() {
		return "signUp";
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Member> getMember(@PathVariable("id") Long id){
		Optional<Member> members = member.findById(id);
		return new ResponseEntity<Member>(members.get(), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void> deleteMember(@PathVariable("id") Long id){
		member.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@PostMapping(value="/{save}")
	
	
	
}
