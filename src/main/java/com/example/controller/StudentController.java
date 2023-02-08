package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentServiceImp;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImp studentService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
		String msg="Data added Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public List<Student> getStudent()
	{
		return studentService.getStudent();
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student)
	{
		String msg=studentService.updateStudent(student);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id)
	{
		String msg=studentService.deleteStudent(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
