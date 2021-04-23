package com.example.demo.service;

import java.util.ArrayList;
import com.example.demo.Dto.Member;
import java.util.List;
import java.util.Optional;

import com.example.demo.Dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.customRepository;

@Service
public class MemberService {
	
	@Autowired
	private customRepository custom;
	
	public List<Member> findAll(){
		List<Member> members = new ArrayList<>();
		custom.findAll().forEach(e -> members.add(e));
		return members;
	}
	
	public Optional<Member> findById(Long id){
		Optional<Member> member = custom.findById(id);
		return member;
	}
	
	public void deleteById(Long id) {
		custom.deleteById(id);
	}
	
	public Member save(Member member) {
		custom.save(member);
		return member;
	}
	
}
