package com.example.spring.data.jpa.example.repositary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring.data.jpa.example.entity.Student;
import com.example.spring.data.jpa.example.entity.Student.StudentBuilder;

import java.util.List;

@SpringBootTest
//@DataJpaTest // it can be used to Test the only Repositary Layer 
class StudentRepositaryTest {

	//Craete an Object
	@Autowired
	private StudentRepositary studentRepositary;
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.emailId("praveenkotha@gmail.com")
				.firstName("praveen")
				.lastName("kotha")
				.guardianName("Lingam")
				.guardianEmail("lingam@gmail.com")
				.guardianMobile("9640280321")
				.build();
		
		studentRepositary.save(student);
	}

	@Test
	public void printAllStudent(){
		List<Student> studentList = studentRepositary.findAll();
		System.out.println("studentList = " + studentList);
	}
}
