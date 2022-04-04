package com.greatlearning.crudsecurity.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.crudsecurity.model.Student;
import com.greatlearning.crudsecurity.repository.StudentRepository;

@Service
public class StudentServices {

	@Autowired
	private StudentRepository repo;
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	public void save(Student student) {
		repo.save(student);
	}
	
	public Student get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
}