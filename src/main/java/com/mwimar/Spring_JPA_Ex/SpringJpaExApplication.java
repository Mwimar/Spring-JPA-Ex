package com.mwimar.Spring_JPA_Ex;

import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
		s1.setRollNo(201);
		s1.setName("Gates");
		s1.setMarks(74);
//
//		s2.setRollNo(202);
//		s2.setName("Abdul");
//		s2.setMarks(81);
//
		s3.setRollNo(203);
		s3.setName("Latto");
		s3.setMarks(96);
//
//		repo.save(s2);
//		repo.save(s3);
		repo.delete(s1);

//		System.out.println(repo.findAll());

//		Optional<Student> s=repo.findById(201);
//		System.out.println(s.orElse(new Student()));
//		System.out.println(repo.findByName("Gates"));
//		System.out.println(repo.findByMarksLessThan(90));
//		System.out.println(repo.findByMarksGreaterThan(90));
	}

}
