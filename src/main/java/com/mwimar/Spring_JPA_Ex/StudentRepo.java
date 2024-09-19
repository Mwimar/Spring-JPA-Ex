package com.mwimar.Spring_JPA_Ex;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer> {
   // @Query("select s from Student s where s.name = ?1")
    List <Student> findByName(String name);
    List<Student> findByMarks(Integer marks);



}
