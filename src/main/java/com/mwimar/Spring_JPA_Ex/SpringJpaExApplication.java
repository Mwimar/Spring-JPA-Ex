package com.mwimar.Spring_JPA_Ex;

import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaExApplication.class, args);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);

	}

}
