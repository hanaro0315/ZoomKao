package com.example.demo.Repository;

import com.example.demo.Dto.Member;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customRepository extends JpaRepository<Member, Long>{

	public List<Member> findById(String id);
	
	public List<Member> findByName(String name);
	
	public List<Member> findByIdLike(String keyword);
}
