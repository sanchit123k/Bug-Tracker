package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ifaces.IBugRepo;
import com.example.demo.models.Bug;


@SpringBootApplication
public class BugTrackerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}
	
	@Autowired
	private IBugRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Bug(101, "Ramesh", "Summary 1", "Description 1", "Project 1", "High"));
		repo.save(new Bug(102, "Rakesh", "Summary 2", "Description 2", "Project 2", "Medium"));
		repo.save(new Bug(103, "Suresh", "Summary 3", "Description 3", "Project 1", "High"));
		repo.save(new Bug(104, "Kamlesh", "Summary 4", "Description 4", "Project 3", "Low"));
		repo.save(new Bug(105, "Rahul", "Summary 5", "Description 5", "Project 3", "Medium"));
	}

}
