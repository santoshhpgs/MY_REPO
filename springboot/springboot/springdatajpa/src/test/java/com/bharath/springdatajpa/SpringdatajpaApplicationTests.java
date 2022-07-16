package com.bharath.springdatajpa;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdatajpa.entities.Student;
import com.bharath.springdatajpa.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Bharath");
		student.setTestScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1l).get();
		
		  System.out.println("Id >> " +savedStudent.getId());
		  System.out.println("Name >> " +savedStudent.getName());
		  System.out.println("Testscore >> " +savedStudent.getTestScore());
		 
		assertNotNull(savedStudent);

	}

}
