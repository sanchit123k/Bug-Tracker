package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "bugraised")
@Entity
public class Bug {
	
	@Id
	int id;
	private String assignedTo;
	private String summary;
	private String description;
	private String project;
	private String priority;
	public Bug() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bug(int id, String assignedTo, String summary, String description, String project, String priority) {
		super();
		this.id = id;
		this.assignedTo = assignedTo;
		this.summary = summary;
		this.description = description;
		this.project = project;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
	
	
	
	
	

}
