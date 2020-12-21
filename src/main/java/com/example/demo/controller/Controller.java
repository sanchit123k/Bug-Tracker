package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Bug;
import com.example.demo.services.BugService;

@RestController
public class Controller {
	
	
	@Autowired
	private BugService service;
	
	@GetMapping("/issues")
	public List<Bug> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("/issues/{id}")
	public Optional<Bug> findById(@PathVariable("id") int id) {
		return this.service.findById(id);
	}
	
	@GetMapping("/issues/{pageSize}/{pageNum}")
	public List<Bug> findAll(@PathVariable("pageSize") int pageSize,@PathVariable("pageNum") int pageNum){
		return service.findByPagination(pageNum,pageSize);
	}
	
	@PostMapping("/issues")
	public Bug add(@RequestBody Bug bug) {
		return this.service.add(bug);
	}
	
	@DeleteMapping("/issues/{id}")
	public void delete(@PathVariable("id") int id) {
		this.service.delete(id);
	}
	
	
	
}
