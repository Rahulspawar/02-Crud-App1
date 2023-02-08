package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	public String addStudent(Student student);
	public List<Student> getStudent();
	public String updateStudent(Student student);
	public String deleteStudent(Integer id);

}
