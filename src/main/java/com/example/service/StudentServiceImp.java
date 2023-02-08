package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepo;
import com.example.entity.Student;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public String addStudent(Student student) {
		repo.save(student);
		return "Data is added";
	}

	@Override
	public List<Student> getStudent() {
		List<Student>list=new ArrayList<>();
		repo.findAll().forEach(list::add);   //add the data of student is saved into list
		return list;
	}

	@Override
	public String updateStudent(Student student) {
		repo.save(student);
		return "Data updated";
	}

	@Override
	public String deleteStudent(Integer id) {
		repo.deleteById(id);
		return "Data Deleted";
	}

}
