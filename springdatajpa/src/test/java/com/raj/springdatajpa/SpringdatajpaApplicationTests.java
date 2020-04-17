package com.raj.springdatajpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.raj.springdatajpa.model.Student;
import com.raj.springdatajpa.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {
	
	@Autowired
	private StudentRepository stdRepo;
	

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("raj");
		student.setTestScore(100);
		stdRepo.save(student);

		Student savedStudent = stdRepo.findById(1l).get();
		assertEquals(savedStudent.getName(), student.getName());
		
	}

}
