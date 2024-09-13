package com.mwimar.Spring_JPA_Ex;

import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(201);
//		s1.setName("Gates");
//		s1.setMarks(74);
//
//		s2.setRollNo(202);
//		s2.setName("Abdul");
//		s2.setMarks(81);
//
//		s3.setRollNo(203);
//		s3.setName("Nicky");
//		s3.setMarks(94);
//
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());

		System.out.println(repo.findById(202));
	}

}
