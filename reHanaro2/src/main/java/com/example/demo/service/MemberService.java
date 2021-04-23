package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.customRepository;

@Service
public class MemberService {
	
	@Autowired
	private customRepository custom;
	
	public List<Member> findAll(){
		List<Member> members = new ArrayList<>();
		return members;
	}
}
