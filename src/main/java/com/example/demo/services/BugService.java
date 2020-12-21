package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.IBugRepo;
import com.example.demo.models.Bug;

@Service
public class BugService {
	
	@Autowired
	private IBugRepo repo;
	
	public List<Bug> findAll(){	
		return this.repo.findAll();
	}
	
	public Optional<Bug> findById(int id) {		
		return this.repo.findById(id);
	}
	
	public List<Bug> findByPagination(int pageSize, int pageNumber) {
		Pageable pageRequest = PageRequest.of(pageNumber, pageSize);		
		return this.repo.findAll(pageRequest).getContent();
	}
	
	public Bug add(Bug bug) {		
		return this.repo.save(bug);
	}
	
	public void delete(int id) {
		this.repo.deleteById(id);
	}

}
